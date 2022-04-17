package com.ddoubuy.product.model.vo.product;

import com.ddoubuy.common.model.Basic;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @description: 商品VO对象
 * @author: boykaff
 * @date: 2022-04-17-0017
 */
@ApiModel(value = "ProductVO对象", description = "ProductVO对象")
@EqualsAndHashCode(callSuper = true)
@Data
public class ProductVO extends Basic implements Serializable {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty("商品名称")
    private String name;

    @ApiModelProperty("1级分类ID")
    private String categoryId1;

    @ApiModelProperty("2级分类ID")
    private String categoryId2;

    @ApiModelProperty("3级分类ID")
    private String categoryId3;

    @ApiModelProperty("品牌ID")
    private Integer brandId;

    @ApiModelProperty("商品属性集")
    private String attributes;

    @ApiModelProperty("商品展示图")
    private String pic;

    @ApiModelProperty("商品轮播图播放地址，逗号分隔，最多5张")
    private String carouselPics;

    @ApiModelProperty("商品描述，前期可考虑直接存储，后期可考虑存储在OSS端")
    private String detailHtml;

    @ApiModelProperty("移动端商品描述，前期可考虑直接存储，后期可考虑存储在OSS端")
    private String detailMobleHtml;

    @ApiModelProperty("排序")
    private Integer sort;

    @ApiModelProperty("是否商家推荐")
    private String recommandStatus;

    @ApiModelProperty("审核时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime verifyTime;
}
