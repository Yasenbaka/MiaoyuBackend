package com.miaoyu.backend.response;

import com.miaoyu.backend.utils.R;

public class ResourceR {
    public R resource(boolean is, Object data) {
        R r = new R();
        r.setCode(is? 0: 1);
        r.setMessage("资源获取" + (is? "成功": "失败"));
        r.setData(data);
        return r;
    }
}
