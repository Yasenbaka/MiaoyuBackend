package com.miaoyu.backend.invoice.model;

import java.time.LocalDateTime;

public class InvoiceBindModel {
    private String id;
    private String output_invoice_id;
    private String input_invoice_id;
    private LocalDateTime create_at;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOutput_invoice_id() {
        return output_invoice_id;
    }

    public void setOutput_invoice_id(String output_invoice_id) {
        this.output_invoice_id = output_invoice_id;
    }

    public String getInput_invoice_id() {
        return input_invoice_id;
    }

    public void setInput_invoice_id(String input_invoice_id) {
        this.input_invoice_id = input_invoice_id;
    }

    public LocalDateTime getCreate_at() {
        return create_at;
    }

    public void setCreate_at(LocalDateTime create_at) {
        this.create_at = create_at;
    }
}
