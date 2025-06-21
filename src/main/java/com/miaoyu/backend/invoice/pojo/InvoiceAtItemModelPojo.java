package com.miaoyu.backend.invoice.pojo;

import com.miaoyu.backend.invoice.model.InvoiceItemModel;

import java.util.List;

public class InvoiceAtItemModelPojo extends InvoicePojo {
    private List<InvoiceItemModel> items;

    public List<InvoiceItemModel> getItems() {
        return items;
    }

    public void setItems(List<InvoiceItemModel> items) {
        this.items = items;
    }
}
