package com.miaoyu.backend.invoice.controller;

import com.miaoyu.backend.invoice.enumeration.InvoiceTypeEnum;
import com.miaoyu.backend.utils.R;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/invoice")
public class TestController {
    @GetMapping("/test")
    public R test() {
        R r = new R();
        r.setData(InvoiceTypeEnum.getOptions());
        return r;
    }
}
