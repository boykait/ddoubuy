package com.ddoubuy.cart.model.dto.cart;

import com.ddoubuy.common.model.QueryBasic;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotNull;

/**
 * @description: 购物车查询DTO对象
 * @author: boykaff
 * @date: 2022-04-17-0017
 */
@ApiModel(value = "用户查询购物车", description = "")
@EqualsAndHashCode(callSuper = true)
@Data
public class CartQueryDTO extends QueryBasic {
    @ApiModelProperty(value = "用户ID(userId)", required = true)
    @NotNull(message = "用户ID(userId)不能为空")
    private Long userId;
}
