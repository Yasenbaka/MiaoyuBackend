package com.miaoyu.backend.response;

import com.miaoyu.backend.utils.R;

public class NormalErrorJson {
    public R normalError(Object data) {
        R jsonT = new R();
        jsonT.setCode(1);
        jsonT.setMessage("异常：error");
        jsonT.setData(data);
        return jsonT;
    }
    public R noLogin() {
        R jsonT = new R();
        jsonT.setCode(1);
        jsonT.setMessage("未登录：No login");
        jsonT.setData(jsonT.getMessage());
        return jsonT;
    }
}
