package com.miaoyu.backend.api.invoice.mapper;

import com.miaoyu.backend.api.invoice.model.InvoiceModel;
import com.miaoyu.backend.api.invoice.model.entity.InvoiceEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GetInvoiceMapper {
    List<InvoiceEntity> selectAllInvoices();
    List<InvoiceEntity> selectInvoicesByType(@Param("type") String type);
    List<InvoiceEntity> selectInvoicesByProperty(@Param("property") String property);
    InvoiceModel selectInvoiceById(@Param("invoice_id") String invoiceId);
}
