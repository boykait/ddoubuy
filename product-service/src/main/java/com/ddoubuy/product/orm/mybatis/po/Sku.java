package com.ddoubuy.product.orm.mybatis.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.ddoubuy.common.model.Basic;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author boykaff
 * @since 2022-04-17
 */
@EqualsAndHashCode(callSuper = true)
@Data
@TableName("pms_sku")
@ApiModel(value = "Sku对象", description = "")
public class Sku extends Basic implements Serializable {

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
