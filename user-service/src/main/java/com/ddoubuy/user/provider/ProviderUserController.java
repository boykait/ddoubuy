package com.ddoubuy.user.provider;

import com.ddoubuy.user.orm.mybatis.po.User;
import com.ddoubuy.user.service.IUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
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
    @Autowired
    private IUserService userService;

    @ApiOperation(value = "根据用户ID查询用户信息")
    @GetMapping("/{id}")
    public User getUserById(@PathVariable(name = "id") Integer id) {
        return userService.getById(id);
    }
}
