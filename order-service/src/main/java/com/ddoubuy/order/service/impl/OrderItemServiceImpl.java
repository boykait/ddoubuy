package com.ddoubuy.order.service.impl;

import com.ddoubuy.order.orm.mybatis.po.OrderItem;
import com.ddoubuy.order.orm.mybatis.mapper.OrderItemMapper;
import com.ddoubuy.order.service.IOrderItemService;
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
public class OrderItemServiceImpl extends ServiceImpl<OrderItemMapper, OrderItem> implements IOrderItemService {

}
