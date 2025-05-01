package com.miaoyu.backend.api.invoice.controller;

import com.miaoyu.backend.utils.JsonTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/invoice")
public class GetInvoiceController {
    /**获取所有增值税发票实体
     * @return List中包含所有增值税发票实体*/
    @GetMapping("/all")
    public ResponseEntity<JsonTemplate> getAllInvoiceControl(
            @RequestHeader("Authorization") String token
    ) {
        return ResponseEntity.ok(null);
    }

    /**根据增值税发票的票种获取所有符合条件的增值税发票实体
     * @param type 增值税发票的票种"ordinary/special" 普通发票/专用发票
     * @return List所有符合条件的增值税发票实体*/
    @GetMapping("/invoices_by_type")
    public ResponseEntity<JsonTemplate> getInvoicesByTypeControl(
            @RequestHeader("Authorization") String token,
            @RequestParam("type") String type
    ) {
        return ResponseEntity.ok(null);
    }

    /**根据增值税发票的购销属性获取所有符合条件的增值税发票实体
     * @param property 购销属性"sell/purchase"销售票/购买票
     * @return List中包含所有符合条件的增值税发票实体*/
    @GetMapping("/invoices_by_property")
    public ResponseEntity<JsonTemplate> getInvoicesByPropertyControl(
            @RequestHeader("Authorization") String token,
            @RequestParam("property") String property
    ) {
        return ResponseEntity.ok(null);
    }

    /**根据增值税发票的票号获取唯一符合条件的增值税发票实体
     * @param invoiceId 增值税发票的票号
     * @return 唯一符合条件的增值税发票实体*/
    @GetMapping("/only")
    public ResponseEntity<JsonTemplate> getInvoiceByIdControl(
            @RequestHeader("Authorization") String token,
            @RequestParam("invoice_id") String invoiceId
    ) {
        return ResponseEntity.ok(null);
    }
}
