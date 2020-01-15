package com.global.common.utils.constants.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;
import java.util.Optional;

/**
 * @Author: 鲁砚琨
 * @CreateTime: 2020-01-15 下午 03:59
 * @Version: v1.0
 */
@AllArgsConstructor
@Getter
public enum  StatusEnum implements EnumHandle<StatusEnum> {

    DISABLED(0, "禁用"),
    ENABLE(1, "启用");

    /**
     * 枚举值
     */
    private Integer code;

    /**
     * 枚举描述
     */
    private String desc;


    /**
     * 通过枚举值获取枚举
     *
     * @param code 枚举编码
     */
    @Override
    public StatusEnum getEnum(Integer code) {
        Optional<StatusEnum> optional = Arrays.stream(StatusEnum.values())
                .filter(e -> e.getCode().equals(code)).findFirst();
        return optional.isPresent() ? optional.get() : null;
    }

    /**
     * 通过枚举值获取枚举描述
     *
     * @param code 枚举编码
     */
    @Override
    public String getEnumDesc(Integer code) {
        StatusEnum object = getEnum(code);
        return object != null ? object.getDesc() : null;
    }
}
