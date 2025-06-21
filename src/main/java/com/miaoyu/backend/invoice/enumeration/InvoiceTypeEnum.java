package com.miaoyu.backend.invoice.enumeration;

import com.miaoyu.backend.utils.dto.ValueLabelDto;

import java.util.Arrays;
import java.util.List;

public enum InvoiceTypeEnum {
    SPECIAL("增值税专用发票"),
    NORMAL("增值税普通发票"),
    ;

    private final String displayName;

    private static final List<ValueLabelDto> CACHED_OPTIONS = Arrays.stream(InvoiceTypeEnum.values())
            .map(e -> new ValueLabelDto(e.name(), e.getDisplayName()))
            .toList();

    public static List<ValueLabelDto> getOptions() {
        return CACHED_OPTIONS;
    }

    InvoiceTypeEnum(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
