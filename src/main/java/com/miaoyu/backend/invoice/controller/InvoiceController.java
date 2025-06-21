package com.miaoyu.backend.invoice.controller;

import com.miaoyu.backend.invoice.model.InvoiceModel;
import com.miaoyu.backend.invoice.service.InvoiceService;
import com.miaoyu.backend.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/invoice")
public class InvoiceController {
    @Autowired
    private InvoiceService invoiceService;

    @GetMapping("/all")
    public ResponseEntity<R> getAllInvoiceControl() {
        return invoiceService.getAllInvoiceService();
    }

    @GetMapping("/only")
    public ResponseEntity<R> getInvoiceOnlyControl(@RequestParam("id") String id) {
        return invoiceService.getInvoiceOnlyService(id);
    }

    @PostMapping("/upload")
    public ResponseEntity<R> uploadInvoiceControl(@RequestBody InvoiceModel request) {
        return invoiceService.uploadInvoiceService(request);
    }

    @PutMapping("/update")
    public ResponseEntity<R> updateInvoiceControl(@RequestParam("id") String id, @RequestParam("status") String status) {
        return invoiceService.updateInvoiceService(id, status);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<R> deleteInvoiceControl(@RequestParam("id") String id) {
        return invoiceService.deleteInvoiceService(id);
    }
}
