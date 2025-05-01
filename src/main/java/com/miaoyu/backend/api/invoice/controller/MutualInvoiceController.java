package com.miaoyu.backend.api.invoice.controller;

import com.miaoyu.backend.utils.JsonTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/invoice")
public class MutualInvoiceController {

    /**绑定销售票和成本票
     * @param sellInvoiceId 销售票的票号
     * @param purchaseInvoiceId 成本票的票号
     * @return 绑定是否成功*/
    @GetMapping("/bind_sell_purchase")
    public ResponseEntity<JsonTemplate> bindingCostProfitInvoiceControl(
            @RequestHeader("Authorization") String token,
            @RequestParam("sell_invoice_id") String sellInvoiceId,
            @RequestParam("purchase_invoice_id") String purchaseInvoiceId
    ) {
        return ResponseEntity.ok(null);
    }

    /**将增值税发票之间解除绑定
     * @param invoiceId 增值税发票的票号
     * @return 解除绑定是否成功*/
    @GetMapping("/unbind_invoice")
    public ResponseEntity<JsonTemplate> unbindInvoiceControl(
            @RequestHeader("Authorization") String token,
            @RequestParam("invoice_id") String invoiceId
    ) {
        return ResponseEntity.ok(null);
    }
}
