package com.miaoyu.backend.invoice.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class InvoiceItemModel {
    private String id;                     // 明细项ID（数据库主键）
    private String invoice_id;            // 关联的发票ID

    private String name;                 // 商品/服务名称
    private String specification;       // 规格型号（可选）
    private String unit;                 // 单位
    private BigDecimal quantity;        // 数量
    private BigDecimal unit_price;       // 单价

    private BigDecimal amount;          // 金额（= 数量×单价）
    private BigDecimal tax_ate;         // 税率
    private BigDecimal tax_mount;       // 税额

    private String remark;              // 备注（可选）

    private LocalDateTime create_at;
    private LocalDateTime update_at;

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

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
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

    public BigDecimal getUnit_price() {
        return unit_price;
    }

    public void setUnit_price(BigDecimal unit_price) {
        this.unit_price = unit_price;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getTax_ate() {
        return tax_ate;
    }

    public void setTax_ate(BigDecimal tax_ate) {
        this.tax_ate = tax_ate;
    }

    public BigDecimal getTax_mount() {
        return tax_mount;
    }

    public void setTax_mount(BigDecimal tax_mount) {
        this.tax_mount = tax_mount;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public LocalDateTime getCreate_at() {
        return create_at;
    }

    public void setCreate_at(LocalDateTime create_at) {
        this.create_at = create_at;
    }

    public LocalDateTime getUpdate_at() {
        return update_at;
    }

    public void setUpdate_at(LocalDateTime update_at) {
        this.update_at = update_at;
    }
}
