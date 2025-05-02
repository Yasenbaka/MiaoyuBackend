package com.miaoyu.backend.api.invoice.service;

import com.miaoyu.backend.api.invoice.mapper.GetInvoiceMapper;
import com.miaoyu.backend.preset_response.NormalSuccessJson;
import com.miaoyu.backend.utils.JsonTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GetInvoiceService {
    @Autowired
    private GetInvoiceMapper getInvoiceMapper;

    public JsonTemplate getAllInvoiceService() {
        return new NormalSuccessJson().normalSuccess(getInvoiceMapper.selectAllInvoices());
    }
}
