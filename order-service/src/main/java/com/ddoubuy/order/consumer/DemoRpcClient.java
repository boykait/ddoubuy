package com.ddoubuy.order.consumer;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @description:
 * @author: boykaff
 * @date: 2022-04-14-0014
 */
@FeignClient(value = "user-service", contextId = "userApi" )
public interface DemoRpcClient {
    @RequestMapping("/provider/demo/{id}")
     Object getById(@PathVariable(name = "id") Integer id);
}
