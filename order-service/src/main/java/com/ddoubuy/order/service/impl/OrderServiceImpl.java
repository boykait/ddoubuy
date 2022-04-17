package com.ddoubuy.order.service.impl;

import com.ddoubuy.order.orm.mybatis.po.Order;
import com.ddoubuy.order.orm.mybatis.mapper.OrderMapper;
import com.ddoubuy.order.service.IOrderService;
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
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements IOrderService {

}
