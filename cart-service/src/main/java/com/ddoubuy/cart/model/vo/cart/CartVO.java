package com.ddoubuy.cart.model.vo.cart;

import com.baomidou.mybatisplus.annotation.TableName;
import com.ddoubuy.common.model.Basic;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * <p>
 * 
 * </p>
 *
 * @author boykaff
 * @since 2022-04-16
 */
@EqualsAndHashCode(callSuper = true)
@Data
@ApiModel(value = "Cart对象", description = "")
public class CartVO extends Basic implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("用户购物车流水号")
    private String transNo;

    @ApiModelProperty("用户ID")
    private Long userId;

    @ApiModelProperty("用户昵称")
    private String userNickname;

    @ApiModelProperty("产品ID")
    private Long productId;

    @ApiModelProperty("产品名称")
    private String productName;

    @ApiModelProperty("产品图片")
    private String productPic;

    @ApiModelProperty("产品skuID")
    private Long skuId;

    @ApiModelProperty("产品sku规格")
    private String skuSpecs;

    @ApiModelProperty("产品sku原价")
    private BigDecimal skuOriginalPrice;

    @ApiModelProperty("产品sku折扣价")
    private BigDecimal skuRealPrice;

    @ApiModelProperty("剩余sku对应数量是否足够标记")
    private Integer skuStockEnough;

    @ApiModelProperty("购买数量")
    private Integer num;
}
