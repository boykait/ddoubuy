package com.ddoubuy.order.service.impl;

import com.ddoubuy.order.orm.mybatis.po.ProductCategory;
import com.ddoubuy.order.orm.mybatis.mapper.ProductCategoryMapper;
import com.ddoubuy.order.service.IProductCategoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author boykaff
 * @since 2022-04-16
 */
@Service
public class ProductCategoryServiceImpl extends ServiceImpl<ProductCategoryMapper, ProductCategory> implements IProductCategoryService {

}
