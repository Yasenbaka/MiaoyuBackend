package com.miaoyu.backend.invoice.controller;

import com.miaoyu.backend.invoice.enumeration.InvoicePropertyEnum;
import com.miaoyu.backend.invoice.enumeration.InvoiceStatusEnum;
import com.miaoyu.backend.invoice.enumeration.InvoiceTypeEnum;
import com.miaoyu.backend.response.ResourceR;
import com.miaoyu.backend.utils.R;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/invoice")
public class InvoiceVLController {
    @GetMapping("/vl_type")
    public ResponseEntity<R> getInvoiceTypeControl() {
        return ResponseEntity.ok(new ResourceR().resource(true, InvoiceTypeEnum.getOptions()));
    }

    @GetMapping("/vl_status")
    public ResponseEntity<R> getInvoiceStatusControl() {
        return ResponseEntity.ok(new ResourceR().resource(true, InvoiceStatusEnum.getOptions()));
    }

    @GetMapping("/vl_property")
    public ResponseEntity<R> getInvoicePropertyControl() {
        return ResponseEntity.ok(new ResourceR().resource(true, InvoicePropertyEnum.getOptions()));
    }
}
