package com.ddoubuy.order.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * @description:
 * @author: boykaff
 * @date: 2022-04-11-0011
 */
@Api(tags = "demo-api测试模块")
@RestController
@RequestMapping("/api/order/demo/")
public class DemoConsumerController {
    @ApiOperation(value = "请求测试")
    @GetMapping("/get")
    public Object get() {
        HashMap<String, Object> result = new HashMap<>();
        result.put("code", 200);
        return result;
    }
}
