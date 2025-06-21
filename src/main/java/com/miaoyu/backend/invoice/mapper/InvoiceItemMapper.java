package com.miaoyu.backend.invoice.mapper;

import com.miaoyu.backend.invoice.model.InvoiceItemModel;
import com.miaoyu.backend.invoice.model.entity.InvoiceItemEntity;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface InvoiceItemMapper {
    @Select("SELECT * FROM invoice_item WHERE invoice_id = #{invoice_id}")
    List<InvoiceItemEntity> selectEntityByInvoiceId(@Param("invoice_id") String invoiceId);
    @Select("SELECT * FROM invoice_item WHERE invoice_id = #{invoice_id}")
    List<InvoiceItemModel> selectModelByInvoiceId(@Param("invoice_id") String invoiceId);
    @Delete("DELETE FROM invoice_item WHERE id = #{id}")
    boolean deleteById(@Param("id") String id);
    @Insert("INSERT INTO invoice_item (id, invoice_id, name, specification, unit, quantity, unit_price, amount, tax_rate, tax_amount, remark) VALUES (#{id}, #{invoice_id}, #{name}, #{specification}, #{unit}, #{quantity}, #{unit_price}, #{amount}, #{tax_rate}, #{tax_amount}, #{remark})")
    boolean insert(InvoiceItemModel invoiceItemModel);
}
