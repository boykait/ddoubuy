package com.ddoubuy.common.enums;

import lombok.Getter;

/**
 * @description: 公共错误枚举类
 * @author: boykaff
 * @date: 2022-04-14-0014
 */
@Getter
public enum CommonError {
    NO_AUTH(401, "用户鉴权不通过"),
    NO_DATA(404, "未请求到数据"),
    PARAM_ERROR(406, "请求参数错误"),
    SERVER_ERROR(500, "服务器内部错误");

    private int code;
    private String msg;

    CommonError(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
