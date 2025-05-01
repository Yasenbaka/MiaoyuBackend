package com.miaoyu.backend.preset_response;

import com.miaoyu.backend.utils.JsonTemplate;

public class DevErrorJson {
    public JsonTemplate programParamError() {
        JsonTemplate jsonT = new JsonTemplate();
        jsonT.setCode(1);
        jsonT.setMessage("程序代码参数出错：Program param error");
        return jsonT;
    }
}
