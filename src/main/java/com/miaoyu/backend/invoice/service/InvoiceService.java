package com.miaoyu.backend.invoice.service;

import com.miaoyu.backend.invoice.enumeration.InvoicePropertyEnum;
import com.miaoyu.backend.invoice.mapper.InvoiceBindMapper;
import com.miaoyu.backend.invoice.mapper.InvoiceItemMapper;
import com.miaoyu.backend.invoice.mapper.InvoiceMapper;
import com.miaoyu.backend.invoice.model.InvoiceBindModel;
import com.miaoyu.backend.invoice.model.InvoiceItemModel;
import com.miaoyu.backend.invoice.model.InvoiceModel;
import com.miaoyu.backend.invoice.pojo.InvoiceAtItemModelPojo;
import com.miaoyu.backend.invoice.pojo.InvoicePojo;
import com.miaoyu.backend.response.NormalR;
import com.miaoyu.backend.response.ResourceR;
import com.miaoyu.backend.response.UDUR;
import com.miaoyu.backend.utils.R;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class InvoiceService {
    @Autowired
    private InvoiceMapper invoiceMapper;
    @Autowired
    private InvoiceBindMapper invoiceBindMapper;
    @Autowired
    private InvoiceItemMapper invoiceItemMapper;

    public ResponseEntity<R> getAllInvoiceService() {
        return ResponseEntity.ok(new ResourceR().resource(true, invoiceMapper.selectAll()));
    }
    public ResponseEntity<R> getAllInvoiceByQuarterService(Integer year, Integer quarter) {
        LocalDate start, end;
        switch (quarter) {
            case 0: {
                start = LocalDate.of(year, 1, 1);
                end = LocalDate.of(year, 12, 31);
                break;
            } case 1: {
                start = LocalDate.of(year, 1, 1);
                end = LocalDate.of(year, 3, 31);
                break;
            } case 2: {
                start = LocalDate.of(year, 4, 1);
                end = LocalDate.of(year, 6, 30);
                break;
            } case 3: {
                start = LocalDate.of(year, 7, 1);
                end = LocalDate.of(year, 9, 30);
                break;
            } case 4: {
                start = LocalDate.of(year, 10, 1);
                end = LocalDate.of(year, 12, 31);
                break;
            } default: {
                return ResponseEntity.status(403).body(new NormalR().text(false, "数据不正确"));
            }
        }
        return this.getAllInvoiceByRangeService(start, end);
    }
    public ResponseEntity<R> getAllInvoiceByRangeService(LocalDate start, LocalDate end) {
        return ResponseEntity.ok(new ResourceR().resource(true, invoiceMapper.selectByRange(start, end)));
    }
    public ResponseEntity<R> getInvoiceOnlyService(String id) {
        InvoicePojo invoicePojo = invoiceMapper.selectById(id);
        if (invoicePojo == null) {
            return ResponseEntity.ok(new ResourceR().resource(false, null));
        }
        List<InvoiceModel> invoiceList = new ArrayList<>();
        if (invoicePojo.getProperty() == InvoicePropertyEnum.OUTPUT) {
            List<InvoiceBindModel> outputBinds = invoiceBindMapper.selectByOutputInvoiceId(invoicePojo.getId());
            for (InvoiceBindModel invoiceId : outputBinds) {
                invoiceList.add(invoiceMapper.selectById(invoiceId.getInput_invoice_id()));
            }
            invoicePojo.setBinds(invoiceList);
        } else {
            List<InvoiceBindModel> inputBinds = invoiceBindMapper.selectByInputInvoiceId(invoicePojo.getId());
            for (InvoiceBindModel invoiceId : inputBinds) {
                invoiceList.add(invoiceMapper.selectById(invoiceId.getOutput_invoice_id()));
            }
            invoicePojo.setBinds(invoiceList);
        }
//        InvoiceAtItemModelPojo completeInvoice = (InvoiceAtItemModelPojo) invoicePojo;
        InvoiceAtItemModelPojo completeInvoice = new InvoiceAtItemModelPojo();
        BeanUtils.copyProperties(invoicePojo, completeInvoice);
        List<InvoiceItemModel> items = invoiceItemMapper.selectModelByInvoiceId(completeInvoice.getId());
        completeInvoice.setItems(items);
        return ResponseEntity.ok(new ResourceR().resource(true, completeInvoice));
    }
    public ResponseEntity<R> uploadInvoiceService(InvoiceModel request) {
        boolean insert = invoiceMapper.insert(request);
        if (insert) {
            return ResponseEntity.ok(new UDUR().upload(true));
        }
        return ResponseEntity.ok(new UDUR().upload(false));
    }
    public ResponseEntity<R> updateInvoiceService(String id, String status) {
        InvoicePojo invoicePojo = invoiceMapper.selectById(id);
        if (invoicePojo == null) {
            return ResponseEntity.ok(new ResourceR().resource(false, null));
        }
        boolean update = invoiceMapper.update(id, status);
        if (update) {
            return ResponseEntity.ok(new UDUR().update(true));
        }
        return ResponseEntity.ok(new UDUR().update(false));
    }
    public ResponseEntity<R> deleteInvoiceService(String id) {
        boolean delete = invoiceMapper.delete(id);
        if (delete) {
            return ResponseEntity.ok(new UDUR().delete(true));
        }
        return ResponseEntity.ok(new UDUR().delete(false));
    }
}
