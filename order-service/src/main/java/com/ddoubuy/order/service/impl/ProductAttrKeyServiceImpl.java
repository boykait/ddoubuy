package com.ddoubuy.order.service.impl;

import com.ddoubuy.order.orm.mybatis.po.ProductAttrKey;
import com.ddoubuy.order.orm.mybatis.mapper.ProductAttrKeyMapper;
import com.ddoubuy.order.service.IProductAttrKeyService;
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
public class ProductAttrKeyServiceImpl extends ServiceImpl<ProductAttrKeyMapper, ProductAttrKey> implements IProductAttrKeyService {

}
