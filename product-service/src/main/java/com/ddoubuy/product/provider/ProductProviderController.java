package com.ddoubuy.product.provider;

import com.ddoubuy.common.utils.BeanUtils;
import com.ddoubuy.product.model.vo.product.ProductVO;
import com.ddoubuy.product.orm.mybatis.po.Product;
import com.ddoubuy.product.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @description:
 * @author: boykaff
 * @date: 2022-04-17-0017
 */
@RestController
@RequestMapping("/provider/product/")
public class ProductProviderController {
    @Autowired
    private IProductService productService;
    @GetMapping("/{id}")
    public ProductVO getOne(@PathVariable(name = "id") Long id) {
        Product product = productService.getById(id);
        return BeanUtils.copyProperties(product, ProductVO::new);
    }
}
