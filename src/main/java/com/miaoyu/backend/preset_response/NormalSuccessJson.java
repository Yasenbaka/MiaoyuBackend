package com.miaoyu.backend.preset_response;

import com.miaoyu.backend.utils.JsonTemplate;

public class NormalSuccessJson {
    public JsonTemplate normalSuccess(Object data) {
        JsonTemplate jsonT = new JsonTemplate();
        jsonT.setCode(0);
        jsonT.setMessage("成功：Normal success");
        jsonT.setData(jsonT.getMessage());
        return jsonT;
    }
    public JsonTemplate udusSuccess(int udus) {
        JsonTemplate jsonT = new JsonTemplate();
        jsonT.setCode(0);
        switch (udus) {
            case 1: {
                jsonT.setMessage("上传成功：Upload success");
                break;
            } case 2: {
                jsonT.setMessage("删除成功：Delete success");
                break;
            } case 3: {
                jsonT.setMessage("更新成功：Update success");
                break;
            } default: {
                return new DevErrorJson().programParamError();
            }
        }
        jsonT.setData(jsonT.getMessage());
        return jsonT;
    }
}
