package com.miaoyu.backend.invoice.controller;

import com.miaoyu.backend.invoice.service.InvoiceBindService;
import com.miaoyu.backend.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/invoice/bind")
public class InvoiceBindController {
    @Autowired
    private InvoiceBindService invoiceBindService;

    /**记录销购双票绑定
     * @param outputInvoiceId 销项票号
     * @param inputInvoiceId  购项票号*/
    @GetMapping("/upload")
    public ResponseEntity<R> uploadInvoiceBindControl(
            @RequestParam("output_invoice_id") String outputInvoiceId,
            @RequestParam("input_invoice_id") String inputInvoiceId
    ) {
        return invoiceBindService.uploadInvoiceBindService(outputInvoiceId, inputInvoiceId);
    }

    /**删除销购双票绑定
     * @param bindId 绑定记录ID*/
    @DeleteMapping("/delete")
    public ResponseEntity<R> deleteInvoiceBindControl(@RequestParam("bind_id") String bindId) {
        return invoiceBindService.deleteInvoiceBindService(bindId);
    }
}
