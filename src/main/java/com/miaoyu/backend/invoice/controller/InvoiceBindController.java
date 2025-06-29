package com.miaoyu.backend.invoice.controller;

import com.miaoyu.backend.invoice.enumeration.InvoicePropertyEnum;
import com.miaoyu.backend.invoice.model.InvoiceBindModel;
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

    @GetMapping("/list_by_invoice_id")
    public ResponseEntity<R> getInvoiceBindListByInvoiceIdControl(
            @RequestParam("invoice_id") String invoiceId,
            @RequestParam("invoice_property") InvoicePropertyEnum invoiceProperty
            ) {
        return invoiceBindService.getInvoiceBindListByInvoiceIdService(invoiceId, invoiceProperty);
    }

    /**记录销购双票绑定
     * @param request 绑定发票实体*/
    @PostMapping("/upload")
    public ResponseEntity<R> uploadInvoiceBindControl(
            @RequestBody InvoiceBindModel request
            ) {
        return invoiceBindService.uploadInvoiceBindService(request.getOutput_invoice_id(), request.getInput_invoice_id());
    }

    /**删除销购双票绑定
     * @param bindId 绑定记录ID*/
    @DeleteMapping("/delete")
    public ResponseEntity<R> deleteInvoiceBindControl(@RequestParam("bind_id") String bindId) {
        return invoiceBindService.deleteInvoiceBindService(bindId);
    }

    @DeleteMapping("/delete_by_double_invoice_id")
    public ResponseEntity<R> deleteInvoiceBindByDoubleInvoiceIdControl(@RequestBody InvoiceBindModel request) {
        return invoiceBindService.deleteInvoiceBindByDoubleInvoiceIdService(request);
    }
}
