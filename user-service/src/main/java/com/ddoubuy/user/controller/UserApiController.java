package com.ddoubuy.user.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ddoubuy.common.model.Result;
import com.ddoubuy.user.model.po.User;
import com.ddoubuy.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: boykaff
 * @date: 2022-04-15-0015
 */
@RestController
@RequestMapping("/api/member")
public class UserApiController {
    @Autowired
    private UserService memberService;
    @RequestMapping("list10")
    public Result<User> listUser10() {
        IPage<User> pageQuery = new Page<>(1, 10);
        IPage pageResult = memberService.page(pageQuery);
        return Result.success(pageResult);
    }
}
