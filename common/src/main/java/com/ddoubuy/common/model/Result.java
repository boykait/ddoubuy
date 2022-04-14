package com.ddoubuy.common.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.ddoubuy.common.constants.CodeDefinition.FAIL;
import static com.ddoubuy.common.constants.CodeDefinition.SUCCESS;

/**
 * @description: 统一响应体
 * @author: boykaff
 * @date: 2022-04-13-0013
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result<T> {
    private int code;
    private String msg;
    private T data;
    private Pagination pagination;

    public static <T> Result<T> success(T data) {
        return create(SUCCESS, data, null, null);
    }

    public static <T> Result<T> success(T data, Pagination pagination) {
        return create(SUCCESS, data, pagination, null);
    }

    public static <T> Result<T> success(T data, Pagination pagination, String msg) {
        return create(SUCCESS, data, pagination, msg);
    }

    public static <T> Result<T> fail(T data, String msg) {
        return create(FAIL, data, null, msg);
    }

    public static <T> Result<T> fail(int code, T data, String msg) {
        return create(code, data, null, msg);
    }

    public static <T> Result<T> fail(String msg) {
        return create(FAIL, null, null, msg);
    }

    public static <T> Result<T> fail(int code, String msg) {
        return create(code, null, null, msg);
    }

    private static <T> Result<T> create(int code, T data, Pagination pagination, String msg) {
        return new Result<>(code, msg, data, pagination);
    }
}
