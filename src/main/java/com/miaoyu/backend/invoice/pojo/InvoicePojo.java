package com.miaoyu.backend.invoice.pojo;

import com.miaoyu.backend.invoice.model.InvoiceModel;

import java.util.List;

public class InvoicePojo extends InvoiceModel {
    private List<InvoiceModel> binds;

    public List<InvoiceModel> getBinds() {
        return binds;
    }

    public void setBinds(List<InvoiceModel> binds) {
        this.binds = binds;
    }
}
