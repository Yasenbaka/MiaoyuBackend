package com.miaoyu.backend.response;

import com.miaoyu.backend.utils.R;

public class NormalR {
    public R text(boolean is, String text) {
        R r = new R();
        r.setCode(is? 0: 1);
        r.setMessage(text);
        r.setData(r.getMessage());
        return r;
    }
}
