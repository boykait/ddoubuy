package com.ddoubuy.user.api;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ddoubuy.common.model.Result;
import com.ddoubuy.common.utils.JsonUtils;
import com.ddoubuy.user.orm.mybatis.po.User;
import com.ddoubuy.user.service.IUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户前端控制器
 *
 * @author boykaff
 * @since 2022-04-16
 */
@Api(tags = "用户-api服务")
@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    private IUserService userService;

    @ApiOperation(value = "查询10个用户测试")
    @GetMapping("list10")
    public Result<User> listUser10() {
        IPage<User> pageQuery = new Page<>(1, 10);
        IPage pageResult = userService.page(pageQuery);
        JsonUtils.toJsonString(pageResult);
        return Result.success(pageResult);
    }
}
