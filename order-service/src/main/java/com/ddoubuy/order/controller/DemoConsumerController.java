package com.ddoubuy.order.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @description:
 * @author: boykaff
 * @date: 2022-04-11-0011
 */
@RestController
@RequestMapping("/consumer/")
@CrossOrigin
public class DemoConsumerController {
    @Resource
    RestTemplate restTemplate;
    @GetMapping("/get")
    public Object get() {
        return restTemplate.getForObject("http://user-service" + "/user/provider/get", Object.class);
    }
}
