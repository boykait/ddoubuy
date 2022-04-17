package com.ddoubuy.product.provider;

import com.ddoubuy.common.utils.BeanUtils;
import com.ddoubuy.product.model.vo.product.ProductVO;
import com.ddoubuy.product.model.vo.product.SkuVO;
import com.ddoubuy.product.orm.mybatis.po.Sku;
import com.ddoubuy.product.service.ISkuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: boykaff
 * @date: 2022-04-17-0017
 */
@RestController
@RequestMapping("/provider/product/sku/")
public class SkuProviderController {
    @Autowired
    private ISkuService skuService;
    @GetMapping("/{id}")
    public SkuVO getOne(@PathVariable(name = "id") Long id) {
        Sku sku = skuService.getById(id);
        return BeanUtils.copyProperties(sku, SkuVO::new);
    }
}
