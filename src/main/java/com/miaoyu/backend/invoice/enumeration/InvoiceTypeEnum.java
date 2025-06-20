package com.miaoyu.backend.invoice.enumeration;

import com.miaoyu.backend.invoice.dto.InvoiceValueLabelDto;

import java.util.Arrays;
import java.util.List;

public enum InvoiceTypeEnum {
    SPECIAL("增值税专用发票"),
    NORMAL("增值税普通发票"),
    ;

    private final String displayName;

    private static final List<InvoiceValueLabelDto> CACHED_OPTIONS = Arrays.stream(InvoiceTypeEnum.values())
            .map(e -> new InvoiceValueLabelDto(e.name(), e.getDisplayName()))
            .toList();

    public static List<InvoiceValueLabelDto> getOptions() {
        return CACHED_OPTIONS;
    }

    InvoiceTypeEnum(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
