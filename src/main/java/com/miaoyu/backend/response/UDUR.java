package com.miaoyu.backend.response;

import com.miaoyu.backend.utils.R;

public class UDUR {
    public R upload(boolean is) {
        R r = new R();
        r.setCode(is? 0: 1);
        r.setMessage("上传" + (is? "成功": "失败"));
        r.setData("Upload " + (is? "Success": "Fail"));
        return r;
    }
    public R delete(boolean is) {
        R r = new R();
        r.setCode(is? 0: 1);
        r.setMessage("删除" + (is? "成功": "失败"));
        r.setData("Delete " + (is? "Success": "Fail"));
        return r;
    }
    public R update(boolean is) {
        R r = new R();
        r.setCode(is? 0: 1);
        r.setMessage("更新" + (is? "成功": "失败"));
        r.setData("Update " + (is? "Success": "Fail"));
        return r;
    }
}
