package com.miaoyu.backend.invoice.enumeration;

import com.miaoyu.backend.invoice.dto.InvoiceValueLabelDto;

import java.util.Arrays;
import java.util.List;

public enum InvoiceStatusEnum {
    ISSUED("已开具"),
    DESTROYED("已销毁"),
    DASHED("已红冲"),
    ;

    private static final List<InvoiceValueLabelDto> CACHED_OPTIONS = Arrays.stream(InvoiceStatusEnum.values())
            .map(e -> new InvoiceValueLabelDto(e.name(), e.getDisplayName()))
            .toList();

    public static List<InvoiceValueLabelDto> getOptions() {
        return CACHED_OPTIONS;
    }

    private final String displayName;

    InvoiceStatusEnum(String displayName) {
        this.displayName = displayName;
    }
    public String getDisplayName() {
        return displayName;
    }
}
