package com.ddoubuy.cart.consumer;

import com.ddoubuy.cart.model.vo.product.ProductVO;
import com.ddoubuy.cart.model.vo.product.SkuVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @description: 商品RPC调用端
 * @author: boykaff
 * @date: 2022-04-17-0017
 */
@FeignClient(value = "product-service", contextId = "productRpcApi")
public interface ProductRpcClient {
    @GetMapping("/provider/product/{id}")
    ProductVO getOne(@PathVariable(name = "id") Long id);


}
