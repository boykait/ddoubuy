package com.ddoubuy.cart.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.ddoubuy.cart.model.dto.cart.CartCreateDTO;
import com.ddoubuy.cart.model.dto.cart.CartQueryDTO;
import com.ddoubuy.cart.model.vo.cart.CartVO;
import com.ddoubuy.cart.orm.mybatis.po.Cart;

import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author boykaff
 * @since 2022-04-16
 */
public interface ICartService extends IService<Cart> {
    /**
     * 加入购物车操作
     *
     * @param createDTO 创建购物车对象
     * @return 创建结果
     */
    boolean addCart(CartCreateDTO createDTO);

    /**
     * 查询购物车列表
     *
     * @param queryDTO 查询DTO对象
     * @return 查询结果
     */
    IPage<CartVO> listCart(CartQueryDTO queryDTO);
}
