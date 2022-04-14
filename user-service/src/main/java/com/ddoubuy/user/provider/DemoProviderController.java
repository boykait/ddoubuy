package com.ddoubuy.user.provider;

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
@RestController
@RequestMapping("/provider/demo")
public class DemoProviderController {
    @RequestMapping("/{id}")
    public Object getById(@PathVariable(name = "id") Integer id) {
        Map<String, Object> obj = new HashMap<>();
        obj.put("id", id);
        obj.put("name", "测试账号");
        return obj;
    }
}
