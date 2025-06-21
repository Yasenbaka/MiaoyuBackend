package com.miaoyu.backend.invoice.model.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class InvoiceItemEntity {
    private String id;                     // 明细项ID（数据库主键）
    private String invoice_id;            // 关联的发票ID

    private String name;                 // 商品/服务名称
    private String unit;                 // 单位
    private BigDecimal quantity;        // 数量

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getInvoice_id() {
        return invoice_id;
    }

    public void setInvoice_id(String invoice_id) {
        this.invoice_id = invoice_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }
}
