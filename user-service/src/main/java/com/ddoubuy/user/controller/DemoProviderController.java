package com.ddoubuy.user.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @description:
 * @author: boykaff
 * @date: 2022-04-11-0011
 */
@RestController
@RequestMapping("/user/provider")
public class DemoProviderController {
    @GetMapping("/get")
    public Object getUserInfo() {
        Map<String, Object> result = new HashMap<>();
        result.put("code", 200);
        result.put("message", "成功");
        return result;
    }
}
