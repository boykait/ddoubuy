package com.ddoubuy.cart.service.impl;

import com.ddoubuy.cart.orm.mybatis.po.Cart;
import com.ddoubuy.cart.orm.mybatis.mapper.CartMapper;
import com.ddoubuy.cart.service.ICartService;
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
public class CartServiceImpl extends ServiceImpl<CartMapper, Cart> implements ICartService {

}
