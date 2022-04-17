package com.ddoubuy.product.service.impl;

import com.ddoubuy.product.orm.mybatis.po.ProductCategory;
import com.ddoubuy.product.orm.mybatis.mapper.ProductCategoryMapper;
import com.ddoubuy.product.service.IProductCategoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author boykaff
 * @since 2022-04-17
 */
@Service
public class ProductCategoryServiceImpl extends ServiceImpl<ProductCategoryMapper, ProductCategory> implements IProductCategoryService {

}
