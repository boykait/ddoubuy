package com.ddoubuy.order.orm.mybatis.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 
 * </p>
 *
 * @author boykaff
 * @since 2022-04-16
 */
@TableName("pms_product")
@ApiModel(value = "Product对象", description = "")
public class Product implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("ID")
      @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

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

    @ApiModelProperty("状态")
    private String status;

    @ApiModelProperty("是否商家推荐")
    private String recommandStatus;

    @ApiModelProperty("创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty("修改时间")
    private LocalDateTime updateTime;

    @ApiModelProperty("审核时间")
    private LocalDateTime verifyTime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategoryId1() {
        return categoryId1;
    }

    public void setCategoryId1(String categoryId1) {
        this.categoryId1 = categoryId1;
    }

    public String getCategoryId2() {
        return categoryId2;
    }

    public void setCategoryId2(String categoryId2) {
        this.categoryId2 = categoryId2;
    }

    public String getCategoryId3() {
        return categoryId3;
    }

    public void setCategoryId3(String categoryId3) {
        this.categoryId3 = categoryId3;
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public String getAttributes() {
        return attributes;
    }

    public void setAttributes(String attributes) {
        this.attributes = attributes;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getCarouselPics() {
        return carouselPics;
    }

    public void setCarouselPics(String carouselPics) {
        this.carouselPics = carouselPics;
    }

    public String getDetailHtml() {
        return detailHtml;
    }

    public void setDetailHtml(String detailHtml) {
        this.detailHtml = detailHtml;
    }

    public String getDetailMobleHtml() {
        return detailMobleHtml;
    }

    public void setDetailMobleHtml(String detailMobleHtml) {
        this.detailMobleHtml = detailMobleHtml;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRecommandStatus() {
        return recommandStatus;
    }

    public void setRecommandStatus(String recommandStatus) {
        this.recommandStatus = recommandStatus;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public LocalDateTime getVerifyTime() {
        return verifyTime;
    }

    public void setVerifyTime(LocalDateTime verifyTime) {
        this.verifyTime = verifyTime;
    }

    @Override
    public String toString() {
        return "Product{" +
        "id=" + id +
        ", name=" + name +
        ", categoryId1=" + categoryId1 +
        ", categoryId2=" + categoryId2 +
        ", categoryId3=" + categoryId3 +
        ", brandId=" + brandId +
        ", attributes=" + attributes +
        ", pic=" + pic +
        ", carouselPics=" + carouselPics +
        ", detailHtml=" + detailHtml +
        ", detailMobleHtml=" + detailMobleHtml +
        ", sort=" + sort +
        ", status=" + status +
        ", recommandStatus=" + recommandStatus +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        ", verifyTime=" + verifyTime +
        "}";
    }
}
