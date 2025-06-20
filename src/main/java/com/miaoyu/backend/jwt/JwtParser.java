/*
* 解码JWT的类
* param
*   token密钥
*   source来源（token的签发源）*/
package com.miaoyu.backend.jwt;

import com.miaoyu.backend.response.NormalErrorJson;
import com.miaoyu.backend.response.NormalSuccessJson;
import com.miaoyu.backend.service.JwtService;
import com.miaoyu.backend.utils.R;
import io.jsonwebtoken.*;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import io.jsonwebtoken.security.SignatureException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.crypto.SecretKey;

@Service
public class JwtParser {
    @Autowired
    private JwtService jwtService;

    public R jwtParser(String token, String source) {
        Claims payload;
        SecretKey key = Keys.hmacShaKeyFor(Decoders.BASE64.decode(jwtService.getKey()));
        try{
            payload = Jwts.parser()
                    .verifyWith(key)
                    .build()
                    .parseSignedClaims(token)
                    .getPayload();
        } catch (ExpiredJwtException e){
            System.out.println("ExpiredJwtException" + e.getMessage());
            return new NormalErrorJson().normalError("令牌已过期！");
        } catch (SignatureException e) {
            System.out.println("SignatureException" + e.getMessage());
            return new NormalErrorJson().normalError("令牌鉴签失效！");
        } catch (MalformedJwtException e) {
            System.out.println("MalformedJwtException" + e.getMessage());
            return new NormalErrorJson().normalError("令牌错误！");
        } catch (UnsupportedJwtException e) {
            System.out.println("UnsupportedJwtException" + e.getMessage());
            return new NormalErrorJson().normalError("令牌解算失效！");
        } catch (JwtException e){
            System.out.println("JwtException" + e.getMessage());
            return new NormalErrorJson().normalError("令牌无效！");
        }
        return new NormalSuccessJson().normalSuccess(payload.get("uuid"));
//        if (source.equals("web") && payload.get("source").equals(source)){
//            return new NormalMap().normalSuccessMap(payload.get("uuid"));
//        } else if (source.equals("bot") && payload.get("source").equals(source)) {
//            return new NormalMap().normalSuccessMap(payload.get("appid"));
//        } else {
//            return new ErrorMap().errorMap("令牌无效！");
//        }
    }
}
