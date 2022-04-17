package com.ddoubuy.product.orm.mybatis.po;

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
 * @since 2022-04-17
 */
@TableName("pms_sku_attr_key")
@ApiModel(value = "SkuAttrKey对象", description = "")
public class SkuAttrKey implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("ID")
      @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("商品SKU属性名")
    private String name;

    @ApiModelProperty("1级分类ID")
    private String categoryId1;

    @ApiModelProperty("2级分类ID")
    private String categoryId2;

    @ApiModelProperty("3级分类ID")
    private String categoryId3;

    @ApiModelProperty("状态")
    private String status;

    @ApiModelProperty("创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty("修改时间")
    private LocalDateTime updateTime;


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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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

    @Override
    public String toString() {
        return "SkuAttrKey{" +
        "id=" + id +
        ", name=" + name +
        ", categoryId1=" + categoryId1 +
        ", categoryId2=" + categoryId2 +
        ", categoryId3=" + categoryId3 +
        ", status=" + status +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        "}";
    }
}
