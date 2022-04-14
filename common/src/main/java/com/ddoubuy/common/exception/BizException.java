package com.ddoubuy.common.exception;

import com.ddoubuy.common.enums.CommonError;
import lombok.Getter;

/**
 * @description: 业务异常类
 * @author: boykaff
 * @date: 2022-04-14-0014
 */
@Getter
public class BizException extends RuntimeException {
    private int code;
    private String msg;
    private Object data;

    public BizException(String msg) {
        super(msg);
        this.msg = msg;
    }

    public BizException(int code, String msg) {
        super(msg);
        this.code = code;
        this.msg = msg;
    }

    public BizException(int code, String msg, Object data) {
        super(msg);
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public BizException(CommonError error) {
        this.code = error.getCode();
        this.msg = error.getMsg();
    }
}
