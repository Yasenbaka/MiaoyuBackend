package com.miaoyu.backend.api.invoice.model;

public class BindInvoiceModel {
    private String id;
    private String purchase_invoice_id;
    private String sell_invoice_id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPurchase_invoice_id() {
        return purchase_invoice_id;
    }

    public void setPurchase_invoice_id(String purchase_invoice_id) {
        this.purchase_invoice_id = purchase_invoice_id;
    }

    public String getSell_invoice_id() {
        return sell_invoice_id;
    }

    public void setSell_invoice_id(String sell_invoice_id) {
        this.sell_invoice_id = sell_invoice_id;
    }
}
