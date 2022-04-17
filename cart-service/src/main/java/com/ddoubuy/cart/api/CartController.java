package com.ddoubuy.cart.api;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.ddoubuy.cart.model.dto.cart.CartCreateDTO;
import com.ddoubuy.cart.model.dto.cart.CartQueryDTO;
import com.ddoubuy.cart.model.vo.cart.CartVO;
import com.ddoubuy.cart.service.ICartService;
import com.ddoubuy.common.model.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  购物车控制器
 * </p>
 *
 * @author boykaff
 * @since 2022-04-16
 */
@Api(tags = "购物车-api服务")
@RestController
@RequestMapping("/api/cart/")
public class CartController {
    @Autowired
    private ICartService cartService;

    /**
     * 加入购物车操作
     *
     * @param createDTO 创建购物车对象
     * @return 创建结果
     */
    @ApiOperation(value = "加入购物车")
    @PostMapping("/add")
    public Result addCart(@Validated @RequestBody CartCreateDTO createDTO) {
        boolean result = cartService.addCart(createDTO);
        return result ? Result.success(true, "加入购物车成功") : Result.fail("加入购物车失败");
    }

    @ApiOperation(value = "查询用户购物车列表")
    @PostMapping("/list")
    public Result<List<CartVO>> listCart(@Validated @RequestBody CartQueryDTO queryDTO) {
        IPage<CartVO> cartVOIPage = cartService.listCart(queryDTO);
        return Result.success(cartVOIPage);
    }
}
