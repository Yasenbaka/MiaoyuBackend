package com.miaoyu.backend.invoice.enumeration;

import com.miaoyu.backend.utils.dto.ValueLabelDto;

import java.util.Arrays;
import java.util.List;

public enum InvoiceStatusEnum {
    ISSUED("已开具"),
    DESTROYED("已销毁"),
    DASHED("已红冲"),
    ;

    private static final List<ValueLabelDto> CACHED_OPTIONS = Arrays.stream(InvoiceStatusEnum.values())
            .map(e -> new ValueLabelDto(e.name(), e.getDisplayName()))
            .toList();

    public static List<ValueLabelDto> getOptions() {
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
