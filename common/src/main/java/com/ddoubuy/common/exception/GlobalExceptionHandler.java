package com.ddoubuy.common.exception;

import com.ddoubuy.common.model.Result;
import com.ddoubuy.common.utils.JsonUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

import static com.ddoubuy.common.constants.CodeDefinition.FAIL;

/**
 * @description: 全局异常处理
 * @author: boykaff
 * @date: 2022-04-14-0014
 */
@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {
    @ExceptionHandler(value = BizException.class)
    public Result bizExceptionHandler(HttpServletRequest req, BizException be) {
        log.error("请求业务异常：{}, error: {}", req.getRequestURI(), JsonUtils.toJsonString(be));
        return Result.fail(be.getCode(), be.getData(), be.getMsg());
    }

    @ExceptionHandler(value = Exception.class)
    public Result exceptionHandler(HttpServletRequest req, Exception e) {
        log.error("处理异常：{}, error: {}", req.getRequestURI(), e.getMessage());
        return Result.fail(FAIL, e.getMessage());
    }
}
