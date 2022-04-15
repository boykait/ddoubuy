package com.ddoubuy.common.enums;

import lombok.Getter;

/**
 * @description: 状态枚举类
 * @author: boykaff
 * @date: 2022-04-15-0015
 */
public enum Status {
    active(0), del(1), audit(2), illegal(3);
    @Getter
    private int code;

    Status(int code) {
        this.code = code;
    }
}
