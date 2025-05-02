package com.miaoyu.backend.api.invoice.model.entity;

public class InvoiceEntity {
    private String id;
    private String type;
    private String property;
    private String seller;
    private String purchaser;
    private Integer year;
    private Integer month;
    private Integer day;
    private String after_tax_amount;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    public String getPurchaser() {
        return purchaser;
    }

    public void setPurchaser(String purchaser) {
        this.purchaser = purchaser;
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

    public String getAfter_tax_amount() {
        return after_tax_amount;
    }

    public void setAfter_tax_amount(String after_tax_amount) {
        this.after_tax_amount = after_tax_amount;
    }
}
