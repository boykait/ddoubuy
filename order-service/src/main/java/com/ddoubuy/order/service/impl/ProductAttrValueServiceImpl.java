package com.ddoubuy.order.service.impl;

import com.ddoubuy.order.orm.mybatis.po.ProductAttrValue;
import com.ddoubuy.order.orm.mybatis.mapper.ProductAttrValueMapper;
import com.ddoubuy.order.service.IProductAttrValueService;
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
public class ProductAttrValueServiceImpl extends ServiceImpl<ProductAttrValueMapper, ProductAttrValue> implements IProductAttrValueService {

}
