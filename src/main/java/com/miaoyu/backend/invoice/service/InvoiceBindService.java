package com.miaoyu.backend.invoice.service;

import com.miaoyu.backend.invoice.enumeration.InvoicePropertyEnum;
import com.miaoyu.backend.invoice.mapper.InvoiceBindMapper;
import com.miaoyu.backend.invoice.mapper.InvoiceMapper;
import com.miaoyu.backend.invoice.model.InvoiceBindModel;
import com.miaoyu.backend.invoice.pojo.InvoicePojo;
import com.miaoyu.backend.response.NormalR;
import com.miaoyu.backend.response.ResourceR;
import com.miaoyu.backend.response.UDUR;
import com.miaoyu.backend.utils.R;
import com.miaoyu.backend.utils.generate.GenerateUUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class InvoiceBindService {
    @Autowired
    private InvoiceMapper invoiceMapper;
    @Autowired
    private InvoiceBindMapper invoiceBindMapper;

    public ResponseEntity<R> uploadInvoiceBindService(String outputInvoiceId, String inputInvoiceId) {
        InvoicePojo outputInvoice = invoiceMapper.selectById(outputInvoiceId);
        InvoicePojo inputInvoice = invoiceMapper.selectById(inputInvoiceId);
        if (outputInvoice == null || inputInvoice == null) {
            return ResponseEntity.ok(new ResourceR().resource(false, null));
        }
        if (outputInvoice.getProperty() == InvoicePropertyEnum.INPUT) {
            return ResponseEntity.ok(new NormalR().text(false, "必须使用销项发票作为基准进行绑定！"));
        }
        if (inputInvoice.getProperty() == InvoicePropertyEnum.OUTPUT) {
            return ResponseEntity.ok(new NormalR().text(false, "进项发票号填写的是销项发票号！"));
        }
        InvoiceBindModel invoiceBindModel = new InvoiceBindModel();
        invoiceBindModel.setId(new GenerateUUID().getUuid36l());
        invoiceBindModel.setOutput_invoice_id(outputInvoiceId);
        invoiceBindModel.setInput_invoice_id(inputInvoiceId);
        boolean insert = invoiceBindMapper.insert(invoiceBindModel);
        if (insert) {
            return ResponseEntity.ok(new UDUR().upload(true));
        }
        return ResponseEntity.ok(new UDUR().upload(false));
    }
    public ResponseEntity<R> deleteInvoiceBindService(String bindId) {
        boolean delete = invoiceBindMapper.delete(bindId);
        if (delete) {
            return ResponseEntity.ok(new UDUR().delete(true));
        }
        return ResponseEntity.ok(new UDUR().delete(false));
    }
}
