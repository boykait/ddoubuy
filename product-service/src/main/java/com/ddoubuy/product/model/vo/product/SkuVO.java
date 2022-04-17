package com.ddoubuy.product.model.vo.product;

import com.ddoubuy.common.model.Basic;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @description: SKU VO对象
 * @author: boykaff
 * @date: 2022-04-17-0017
 */
@EqualsAndHashCode(callSuper = true)
@Data
@ApiModel(value = "Sku VO对象", description = "SKU VO对象")
public class SkuVO extends Basic implements Serializable {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty("产品分类ID")
    private String name;

    @ApiModelProperty("产品ID")
    private Integer productId;

    @ApiModelProperty("规格属性集合")
    private String specs;

    @ApiModelProperty("原价")
    private BigDecimal originalPrice;

    @ApiModelProperty("折扣价")
    private BigDecimal realPrice;

    @ApiModelProperty("排序")
    private Integer sort;
}
