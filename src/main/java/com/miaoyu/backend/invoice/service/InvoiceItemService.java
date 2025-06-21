package com.miaoyu.backend.invoice.service;

import com.miaoyu.backend.invoice.mapper.InvoiceItemMapper;
import com.miaoyu.backend.invoice.mapper.InvoiceMapper;
import com.miaoyu.backend.invoice.model.InvoiceItemModel;
import com.miaoyu.backend.invoice.pojo.InvoicePojo;
import com.miaoyu.backend.response.ResourceR;
import com.miaoyu.backend.response.UDUR;
import com.miaoyu.backend.utils.R;
import com.miaoyu.backend.utils.generate.GenerateUUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class InvoiceItemService {
    @Autowired
    private InvoiceMapper invoiceMapper;
    @Autowired
    private InvoiceItemMapper invoiceItemMapper;

    public ResponseEntity<R> uploadInvoiceService(InvoiceItemModel request) {
        InvoicePojo invoice = invoiceMapper.selectById(request.getInvoice_id());
        if (invoice == null) {
            return ResponseEntity.ok(new ResourceR().resource(false, null));
        }
        request.setId(new GenerateUUID().getUuid36l());
        boolean insert = invoiceItemMapper.insert(request);
        if (insert) {
            return ResponseEntity.ok(new UDUR().upload(true));
        }
        return ResponseEntity.ok(new UDUR().upload(false));
    }

    public ResponseEntity<R> deleteInvoiceItemByIdService(String itemId) {
        boolean b = invoiceItemMapper.deleteById(itemId);
        if (b) {
            return ResponseEntity.ok(new UDUR().delete(true));
        }
        return ResponseEntity.ok(new UDUR().delete(false));
    }
}
