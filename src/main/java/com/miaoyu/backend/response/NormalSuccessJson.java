package com.miaoyu.backend.response;

import com.miaoyu.backend.utils.R;

public class NormalSuccessJson {
    public R normalSuccess(Object data) {
        R jsonT = new R();
        jsonT.setCode(0);
        jsonT.setMessage("成功：Normal success");
        jsonT.setData(jsonT.getMessage());
        return jsonT;
    }
    public R udusSuccess(int udus) {
        R jsonT = new R();
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
