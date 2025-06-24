package com.miaoyu.backend.invoice.controller;

import com.miaoyu.backend.invoice.model.InvoiceItemModel;
import com.miaoyu.backend.invoice.service.InvoiceItemService;
import com.miaoyu.backend.utils.R;
import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/invoice/item")
public class InvoiceItemController {
    @Autowired
    private InvoiceItemService invoiceItemService;

    /**上传发票中产品信息
     * @param request 产品信息实体*/
    @PostMapping("/upload")
    public ResponseEntity<R> uploadInvoiceItemControl(@RequestBody InvoiceItemModel request) {
        return invoiceItemService.uploadInvoiceService(request);
    }

    /**根据产品ID删除产品信息
     * @param itemId 产品ID*/
    @DeleteMapping("/delete")
    public ResponseEntity<R> deleteInvoiceItemControl(@RequestParam("item_id") String itemId) {
        return invoiceItemService.deleteInvoiceItemByIdService(itemId);
    }
}
