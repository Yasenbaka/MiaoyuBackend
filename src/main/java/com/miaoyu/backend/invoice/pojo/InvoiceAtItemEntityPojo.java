package com.miaoyu.backend.invoice.pojo;

import com.miaoyu.backend.invoice.model.entity.InvoiceItemEntity;

import java.util.List;

public class InvoiceAtItemEntityPojo extends InvoicePojo{
    private List<InvoiceItemEntity> items;

    public List<InvoiceItemEntity> getItems() {
        return items;
    }

    public void setItems(List<InvoiceItemEntity> items) {
        this.items = items;
    }
}
