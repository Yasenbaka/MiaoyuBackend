package com.miaoyu.backend.utils;

import com.miaoyu.backend.jwt.JwtParser;
import com.miaoyu.backend.response.NormalErrorJson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Token {
    @Autowired
    private JwtParser jwtParser;

    public R tokenUtil (String token){
        if (token == null){
            return new NormalErrorJson().noLogin();
        }
        return jwtParser.jwtParser(token, "");
    }
}
