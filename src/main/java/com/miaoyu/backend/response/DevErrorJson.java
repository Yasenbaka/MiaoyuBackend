package com.miaoyu.backend.response;

import com.miaoyu.backend.utils.R;

public class DevErrorJson {
    public R programParamError() {
        R jsonT = new R();
        jsonT.setCode(1);
        jsonT.setMessage("程序代码参数出错：Program param error");
        return jsonT;
    }
}
