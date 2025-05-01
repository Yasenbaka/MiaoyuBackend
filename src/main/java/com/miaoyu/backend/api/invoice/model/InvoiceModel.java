package com.miaoyu.backend.api.invoice.model;

public class InvoiceModel {
    private String id;
    private String type;
    private String property;
    private String seller;
    private String seller_id;
    private String purchaser;
    private String purchaser_id;
    private Integer year;
    private Integer month;
    private Integer day;
    private String before_tax_amount;
    private String after_tax_amount;
    private String tax_amount;
    private String tax_rate;
    private String remark;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
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

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public Integer getDay() {
        return day;
    }

    public void setDay(Integer day) {
        this.day = day;
    }

    public String getBefore_tax_amount() {
        return before_tax_amount;
    }

    public void setBefore_tax_amount(String before_tax_amount) {
        this.before_tax_amount = before_tax_amount;
    }

    public String getAfter_tax_amount() {
        return after_tax_amount;
    }

    public void setAfter_tax_amount(String after_tax_amount) {
        this.after_tax_amount = after_tax_amount;
    }

    public String getTax_amount() {
        return tax_amount;
    }

    public void setTax_amount(String tax_amount) {
        this.tax_amount = tax_amount;
    }

    public String getTax_rate() {
        return tax_rate;
    }

    public void setTax_rate(String tax_rate) {
        this.tax_rate = tax_rate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
