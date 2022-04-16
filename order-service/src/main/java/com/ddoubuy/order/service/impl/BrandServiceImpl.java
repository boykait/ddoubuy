package com.ddoubuy.order.service.impl;

import com.ddoubuy.order.orm.mybatis.po.Brand;
import com.ddoubuy.order.orm.mybatis.mapper.BrandMapper;
import com.ddoubuy.order.service.IBrandService;
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
public class BrandServiceImpl extends ServiceImpl<BrandMapper, Brand> implements IBrandService {

}
