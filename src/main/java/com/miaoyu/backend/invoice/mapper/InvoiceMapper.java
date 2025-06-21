package com.miaoyu.backend.invoice.mapper;

import com.miaoyu.backend.invoice.model.InvoiceModel;
import com.miaoyu.backend.invoice.pojo.InvoicePojo;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface InvoiceMapper {
    @Select("SELECT * FROM invoice")
    List<InvoiceModel> selectAll();
    @Select("SELECT * FROM invoice WHERE id = #{id}")
    InvoicePojo selectById(@Param("id") String id);
    @Insert("INSERT INTO invoice " +
            "(id, type, property, status, seller, seller_id, purchaser, purchaser_id, before_tax_amount, tax_amount, tax_rate, after_tax_amount, remark, issue_at) " +
            "VALUES (#{id}, #{type}, #{property}, #{status}, #{seller}, #{seller_id}, #{purchaser}, #{purchaser_id}, #{before_tax_amount}, #{tax_amount}, #{tax_rate}, #{after_tax_amount}, #{remark}, #{issue_at})")
    boolean insert(InvoiceModel request);
    @Update("UPDATE invoice SET status = #{status} WHERE id = #{id}")
    boolean update(@Param("id") String id, @Param("status") String status);
    @Delete("DELETE FROM invoice WHERE id = #{id}")
    boolean delete(@Param("id") String id);
}
