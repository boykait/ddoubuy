package com.ddoubuy.product.service.impl;

import com.ddoubuy.product.orm.mybatis.po.Product;
import com.ddoubuy.product.orm.mybatis.mapper.ProductMapper;
import com.ddoubuy.product.service.IProductService;
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
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements IProductService {

}
