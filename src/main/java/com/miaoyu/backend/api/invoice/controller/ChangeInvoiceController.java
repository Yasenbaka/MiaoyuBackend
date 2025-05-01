package com.miaoyu.backend.api.invoice.controller;

import com.miaoyu.backend.utils.JsonTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/invoice")
public class ChangeInvoiceController {
    /**上传增值税发票
     * @param request 增值税发票的实体
     * @return 上传是否成功*/
    @PostMapping("/upload")
    public ResponseEntity<JsonTemplate> uploadInvoiceControl(
            @RequestHeader("Authorization") String token,
            @RequestBody JsonTemplate request
    ) {
        return ResponseEntity.ok(null);
    }

    /**修改增值税发票
     * @param request 增值税发票的实体
     * @return 修改是否成功*/
    @PutMapping("/update")
    public ResponseEntity<JsonTemplate> updateInvoiceControl(
            @RequestHeader("Authorization") String token,
            @RequestBody JsonTemplate request
    ) {
        return ResponseEntity.ok(null);
    }

    /**删除增值税发票
     * @param invoiceId 增值税发票的票号
     * @return 删除是否成功*/
    @DeleteMapping("/delete")
    public ResponseEntity<JsonTemplate> deleteInvoiceControl(
            @RequestHeader("Authorization") String token,
            @RequestParam("invoice_id") String invoiceId
    ) {
        return ResponseEntity.ok(null);
    }
}
