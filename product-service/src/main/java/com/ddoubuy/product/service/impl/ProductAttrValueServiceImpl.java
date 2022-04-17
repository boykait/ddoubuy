package com.ddoubuy.product.service.impl;

import com.ddoubuy.product.orm.mybatis.po.ProductAttrValue;
import com.ddoubuy.product.orm.mybatis.mapper.ProductAttrValueMapper;
import com.ddoubuy.product.service.IProductAttrValueService;
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
public class ProductAttrValueServiceImpl extends ServiceImpl<ProductAttrValueMapper, ProductAttrValue> implements IProductAttrValueService {

}
