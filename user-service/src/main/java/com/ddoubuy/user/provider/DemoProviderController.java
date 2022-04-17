package com.ddoubuy.user.provider;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @description:
 * @author: boykaff
 * @date: 2022-04-14-0014
 */
@Api(tags = "demo-rpc测试服务")
@RestController
@RequestMapping("/provider/demo")
public class DemoProviderController {
    @ApiOperation(value = "请求测试")
    @GetMapping("/{id}")
    public Object getById(@PathVariable(name = "id") Integer id) {
        Map<String, Object> obj = new HashMap<>();
        obj.put("id", id);
        obj.put("name", "测试账号");
        return obj;
    }
}
