package com.miaoyu.backend.preset_response;

import com.miaoyu.backend.utils.JsonTemplate;

public class NormalErrorJson {
    public JsonTemplate normalError(Object data) {
        JsonTemplate jsonT = new JsonTemplate();
        jsonT.setCode(1);
        jsonT.setMessage("异常：error");
        jsonT.setData(data);
        return jsonT;
    }
    public JsonTemplate noLogin() {
        JsonTemplate jsonT = new JsonTemplate();
        jsonT.setCode(1);
        jsonT.setMessage("未登录：No login");
        jsonT.setData(jsonT.getMessage());
        return jsonT;
    }
}
