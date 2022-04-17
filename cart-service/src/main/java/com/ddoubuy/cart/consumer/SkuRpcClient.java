package com.ddoubuy.cart.consumer;

import com.ddoubuy.cart.model.vo.product.SkuVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @description: 商品 SKU　RPC调用端
 * @author: boykaff
 * @date: 2022-04-17-0017
 */
@FeignClient(value = "product-service", contextId = "skuRpcApi")
public interface SkuRpcClient {
    @GetMapping("/provider/product/sku/{id}")
    SkuVO getOne(@PathVariable(name = "id") Long id);
}
