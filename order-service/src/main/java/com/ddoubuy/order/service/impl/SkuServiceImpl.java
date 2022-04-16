package com.ddoubuy.order.service.impl;

import com.ddoubuy.order.orm.mybatis.po.Sku;
import com.ddoubuy.order.orm.mybatis.mapper.SkuMapper;
import com.ddoubuy.order.service.ISkuService;
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
public class SkuServiceImpl extends ServiceImpl<SkuMapper, Sku> implements ISkuService {

}
