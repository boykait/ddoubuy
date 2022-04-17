package com.ddoubuy.product.service.impl;

import com.ddoubuy.product.orm.mybatis.po.Sku;
import com.ddoubuy.product.orm.mybatis.mapper.SkuMapper;
import com.ddoubuy.product.service.ISkuService;
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
public class SkuServiceImpl extends ServiceImpl<SkuMapper, Sku> implements ISkuService {

}
