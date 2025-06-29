package com.miaoyu.backend.invoice.mapper;

import com.miaoyu.backend.invoice.model.InvoiceBindModel;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface InvoiceBindMapper {
    @Select("SELECT * FROM invoice_bind")
    List<InvoiceBindModel> selectAll();
    @Select("SELECT * FROM invoice_bind WHERE output_invoice_id = #{invoice_id}")
    List<InvoiceBindModel> selectByOutputInvoiceId(@Param("invoice_id") String output_invoice_id);
    @Select("SELECT * FROM invoice_bind WHERE input_invoice_id = #{invoice_id}")
    List<InvoiceBindModel> selectByInputInvoiceId(@Param("invoice_id") String input_invoice_id);
    @Insert("INSERT INTO invoice_bind (id, output_invoice_id, input_invoice_id) VALUES (#{id}, #{output_invoice_id}, #{input_invoice_id})")
    boolean insert(InvoiceBindModel invoiceBindModel);
    @Delete("DELETE FROM invoice_bind WHERE id = #{id}")
    boolean delete(@Param("id") String id);
    @Delete("DELETE FROM invoice_bind WHERE input_invoice_id = #{request.input_invoice_id} AND output_invoice_id = #{request.output_invoice_id}")
    boolean deleteByDoubleInvoiceId(@Param("request") InvoiceBindModel request);
}
