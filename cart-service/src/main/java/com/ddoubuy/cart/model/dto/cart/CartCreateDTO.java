package com.ddoubuy.cart.model.dto.cart;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @description:
 * @author: boykaff
 * @date: 2022-04-17-0017
 */
@ApiModel(value = "加入购物车对象", description = "")
@Data
public class CartCreateDTO {
    /**
     * 用户ID
     */
    @ApiModelProperty(value = "用户ID(userId)", required = true)
    @NotNull(message = "用户ID(userId)不能为空")
    private Long userId;
    @ApiModelProperty(value = "产品ID", required = true)
    @NotNull(message = "产品ID(productId)不能为空")
    private Long productId;
    /**
     * 产品skuID
     */
    @ApiModelProperty(value = "产品SKU ID", required = true)
    @NotNull(message = "skuId不能为空")
    private Long skuId;
    /**
     * 购买数量
     */
    @ApiModelProperty(value = "产品购买数量", required = true)
    @NotNull(message = "数量(num)不能为空")
    private Integer num;
}
