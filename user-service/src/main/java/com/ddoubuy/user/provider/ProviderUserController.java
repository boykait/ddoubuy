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
 * <p>
 * 用户内部RPC调用相关接口
 * </p>
 *
 * @author boykaff
 * @since 2022-04-16
 */
@Api(tags = "用户-rpc服务")
@RestController
@RequestMapping("/provider/user")
public class ProviderUserController {
    @ApiOperation(value = "请求单个用户测试")
    @GetMapping("/{id}")
    public Object getById(@PathVariable(name = "id") Integer id) {
        Map<String, Object> obj = new HashMap<>();
        obj.put("id", id);
        obj.put("name", "测试账号");
        return obj;
    }
}
