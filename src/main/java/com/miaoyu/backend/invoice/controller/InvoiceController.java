package com.miaoyu.backend.invoice.controller;

import com.miaoyu.backend.invoice.model.InvoiceModel;
import com.miaoyu.backend.invoice.service.InvoiceService;
import com.miaoyu.backend.response.NormalR;
import com.miaoyu.backend.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@RequestMapping("/invoice")
public class InvoiceController {
    @Autowired
    private InvoiceService invoiceService;

    /**获取所有增值税发票信息*/
    @GetMapping("/all")
    public ResponseEntity<R> getAllInvoiceControl() {
        return invoiceService.getAllInvoiceService();
    }

    /**根据年度与季度获取所有符合条件的发票实体
     * @param year 年度
     * @param quarter 季度（0：全年、1：一季度、2：二季度、3：三季度、4：四季度）*/
    @GetMapping("/all_by_quarter")
    public ResponseEntity<R> getAllInvoiceByQuarterControl(
            @RequestParam("year") Integer year,
            @RequestParam("quarter") Integer quarter
    ) {
        return invoiceService.getAllInvoiceByQuarterService(year, quarter);
    }

    /**根据起始与结束范围获取所有符合条件的发票实体
     * @param start 起始日期
     * @param end 结束日期*/
    @GetMapping("/all_by_range")
    public ResponseEntity<R> getAllInvoiceByRangeControl(
            @RequestParam("start") LocalDate start,
            @RequestParam("end") LocalDate end
    ) {
        return invoiceService.getAllInvoiceByRangeService(start, end);
    }

    /**根据发票号获取唯一增值税发票以及其绑定的增值税发票
     * @param id 发票号*/
    @GetMapping("/only")
    public ResponseEntity<R> getInvoiceOnlyControl(@RequestParam("id") String id) {
        return invoiceService.getInvoiceOnlyService(id);
    }

    /**上传增值税发票信息
     * @param request 增值税发票实体*/
    @PostMapping("/upload")
    public ResponseEntity<R> uploadInvoiceControl(@RequestBody InvoiceModel request) {
        return invoiceService.uploadInvoiceService(request);
    }

    /**根据发票号修改发票信息
     * @param id 发票号
     * @param status 发票状态*/
    @PutMapping("/update")
    public ResponseEntity<R> updateInvoiceControl(@RequestParam("id") String id, @RequestParam("status") String status) {
        return invoiceService.updateInvoiceService(id, status);
    }

    /**根据发票号删除发票记录
     * @param id 发票号*/
    @DeleteMapping("/delete")
    public ResponseEntity<R> deleteInvoiceControl(@RequestParam("id") String id) {
        return invoiceService.deleteInvoiceService(id);
    }
}
