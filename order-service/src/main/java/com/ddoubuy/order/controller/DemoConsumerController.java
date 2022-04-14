package com.ddoubuy.order.controller;

import com.ddoubuy.order.consumer.DemoRpcClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: boykaff
 * @date: 2022-04-11-0011
 */
@RestController
@RequestMapping("/consumer/")
public class DemoConsumerController {
    @Autowired
    private DemoRpcClient demoRpcClient;

    @GetMapping("/get")
    public Object get() {
        return demoRpcClient.getById(1);
    }
}
