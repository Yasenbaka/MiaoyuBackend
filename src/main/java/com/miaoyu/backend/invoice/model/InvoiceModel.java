package com.miaoyu.backend.invoice.model;

import com.miaoyu.backend.invoice.enumeration.InvoicePropertyEnum;
import com.miaoyu.backend.invoice.enumeration.InvoiceTypeEnum;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class InvoiceModel {
    private String id; // 发票号
    private InvoiceTypeEnum type; // 发票类型（专用、普通）
    private InvoicePropertyEnum property; // 发票性质（进项、销项）
    private String status; // 发票状态

    private String seller; // 销方主体名
    private String seller_id; // 销方社会统一信用代码
    private String purchaser; // 购方主体名
    private String purchaser_id; // 购方社会统一信用代码

    private BigDecimal before_tax_amount; // 税前金额
    private BigDecimal tax_amount; // 税额
    private BigDecimal tax_rate; // 税率
    private BigDecimal after_tax_amount; // 价税合计
    private String remark; // 发票备注

    private LocalDate issue_at; // 开具日期
    private LocalDateTime create_at; // 记录日期
    private LocalDateTime update_at; // 更新日期

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public InvoiceTypeEnum getType() {
        return type;
    }

    public void setType(InvoiceTypeEnum type) {
        this.type = type;
    }

    public InvoicePropertyEnum getProperty() {
        return property;
    }

    public void setProperty(InvoicePropertyEnum property) {
        this.property = property;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSeller() {
        return seller;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }

    public String getSeller_id() {
        return seller_id;
    }

    public void setSeller_id(String seller_id) {
        this.seller_id = seller_id;
    }

    public String getPurchaser() {
        return purchaser;
    }

    public void setPurchaser(String purchaser) {
        this.purchaser = purchaser;
    }

    public String getPurchaser_id() {
        return purchaser_id;
    }

    public void setPurchaser_id(String purchaser_id) {
        this.purchaser_id = purchaser_id;
    }

    public BigDecimal getBefore_tax_amount() {
        return before_tax_amount;
    }

    public void setBefore_tax_amount(BigDecimal before_tax_amount) {
        this.before_tax_amount = before_tax_amount;
    }

    public BigDecimal getTax_amount() {
        return tax_amount;
    }

    public void setTax_amount(BigDecimal tax_amount) {
        this.tax_amount = tax_amount;
    }

    public BigDecimal getTax_rate() {
        return tax_rate;
    }

    public void setTax_rate(BigDecimal tax_rate) {
        this.tax_rate = tax_rate;
    }

    public BigDecimal getAfter_tax_amount() {
        return after_tax_amount;
    }

    public void setAfter_tax_amount(BigDecimal after_tax_amount) {
        this.after_tax_amount = after_tax_amount;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public LocalDate getIssue_at() {
        return issue_at;
    }

    public void setIssue_at(LocalDate issue_at) {
        this.issue_at = issue_at;
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
