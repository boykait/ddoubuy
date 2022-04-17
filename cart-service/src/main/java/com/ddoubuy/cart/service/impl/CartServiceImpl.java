package com.ddoubuy.cart.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ddoubuy.cart.consumer.ProductRpcClient;
import com.ddoubuy.cart.consumer.SkuRpcClient;
import com.ddoubuy.cart.consumer.UserRpcClient;
import com.ddoubuy.cart.model.dto.cart.CartCreateDTO;
import com.ddoubuy.cart.model.dto.cart.CartQueryDTO;
import com.ddoubuy.cart.model.vo.cart.CartVO;
import com.ddoubuy.cart.model.vo.product.ProductVO;
import com.ddoubuy.cart.model.vo.product.SkuVO;
import com.ddoubuy.cart.model.vo.user.UserVO;
import com.ddoubuy.cart.orm.mybatis.mapper.CartMapper;
import com.ddoubuy.cart.orm.mybatis.po.Cart;
import com.ddoubuy.cart.service.ICartService;
import com.ddoubuy.common.enums.Status;
import com.ddoubuy.common.utils.BeanUtils;
import com.ddoubuy.common.utils.TransUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

import static com.ddoubuy.cart.common.constants.CartServiceConstants.CART_TRANS_NO_PREFIX;

/**
 * <p>
 * 购物车服务实现类
 * </p>
 *
 * @author boykaff
 * @since 2022-04-16
 */
@Service
public class CartServiceImpl extends ServiceImpl<CartMapper, Cart> implements ICartService {
    @Autowired
    private UserRpcClient userRpcClient;
    @Autowired
    private ProductRpcClient productRpcClient;
    @Autowired
    private SkuRpcClient skuRpcClient;

    /**
     * 加入购物车操作
     *
     * @param createDTO 创建购物车对象
     * @return 创建结果
     */
    @Override
    public boolean addCart(CartCreateDTO createDTO) {
        UserVO user = userRpcClient.getById(createDTO.getUserId());
        // todo 校验是否已经加入 校验剩余数量，分布式锁， 并行调用
        ProductVO product = productRpcClient.getOne(createDTO.getProductId());
        SkuVO sku = skuRpcClient.getOne(createDTO.getSkuId());
        Cart cart = new Cart();
        cart.setTransNo(TransUtils.genTransNo(CART_TRANS_NO_PREFIX));
        cart.setUserId(user.getId());
        cart.setUserNickname(user.getNickname());
        cart.setProductId(createDTO.getProductId());
        cart.setProductName(product.getName());
        cart.setProductPic(product.getPic());
        cart.setSkuId(createDTO.getSkuId());
        cart.setSkuOriginalPrice(sku.getOriginalPrice());
        cart.setSkuRealPrice(sku.getRealPrice());
        cart.setNum(createDTO.getNum());
        cart.setStatus(Status.active);
        cart.setCreateTime(LocalDateTime.now());
        cart.setUpdateTime(LocalDateTime.now());
        return save(cart);
    }

    /**
     * 查询购物车列表
     *
     * @param queryDTO 查询DTO对象
     * @return 查询结果
     */
    @Override
    public IPage<CartVO> listCart(CartQueryDTO queryDTO) {
        IPage<Cart> page = new Page<>(queryDTO.getPage(), queryDTO.getSize());
        QueryWrapper<Cart> queryWrapper = new QueryWrapper<>();
        if (null != queryDTO.getUserId()) {
            queryWrapper.eq("user_id", queryDTO.getUserId());
        }
        queryWrapper.orderByDesc("trans_no");
        IPage<Cart> resultPage = page(page, queryWrapper);
        // 该部分逻辑可统一封装
        List<Cart> records = resultPage.getRecords();
        List<CartVO> cartVOS = BeanUtils.copyListProperties(records, CartVO::new);
        Page<CartVO> cartVOPage = new Page<>();
        cartVOPage.setRecords(cartVOS).setPages(resultPage.getPages())
                .setSize(resultPage.getSize())
                .setCurrent(resultPage.getCurrent());
        return cartVOPage;
    }
}
