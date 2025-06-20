package com.miaoyu.backend.api.invoice.service;

import com.miaoyu.backend.api.invoice.mapper.GetInvoiceMapper;
import com.miaoyu.backend.response.NormalSuccessJson;
import com.miaoyu.backend.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GetInvoiceService {
    @Autowired
    private GetInvoiceMapper getInvoiceMapper;

    public R getAllInvoiceService() {
        return new NormalSuccessJson().normalSuccess(getInvoiceMapper.selectAllInvoices());
    }
}
