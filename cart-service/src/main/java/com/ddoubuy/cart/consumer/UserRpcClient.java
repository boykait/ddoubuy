package com.ddoubuy.cart.consumer;

import com.ddoubuy.cart.model.vo.user.UserVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @description: 用户服务RPC调用客户端
 * @author: boykaff
 * @date: 2022-04-14-0014
 */
@FeignClient(value = "user-service", contextId = "userServiceRpcApi")
public interface UserRpcClient {
    @GetMapping("/provider/user/{id}")
    UserVO getById(@PathVariable(name = "id") Long id);
}
