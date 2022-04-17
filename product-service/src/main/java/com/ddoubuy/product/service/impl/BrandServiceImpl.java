package com.ddoubuy.product.service.impl;

import com.ddoubuy.product.orm.mybatis.po.Brand;
import com.ddoubuy.product.orm.mybatis.mapper.BrandMapper;
import com.ddoubuy.product.service.IBrandService;
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
public class BrandServiceImpl extends ServiceImpl<BrandMapper, Brand> implements IBrandService {

}
