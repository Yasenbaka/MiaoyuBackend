package com.miaoyu.backend.invoice.enumeration;

import com.miaoyu.backend.invoice.dto.InvoiceValueLabelDto;

import java.util.Arrays;
import java.util.List;

public enum InvoicePropertyEnum {
    INPUT("进项发票"),
    OUTPUT("销项发票");

    private static final List<InvoiceValueLabelDto> CACHED_OPTIONS = Arrays.stream(InvoicePropertyEnum.values())
            .map(e -> new InvoiceValueLabelDto(e.name(), e.getDisplayName()))
            .toList();
    public static List<InvoiceValueLabelDto> getOptions() {
        return CACHED_OPTIONS;
    }

    private final String displayName;

    InvoicePropertyEnum(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}