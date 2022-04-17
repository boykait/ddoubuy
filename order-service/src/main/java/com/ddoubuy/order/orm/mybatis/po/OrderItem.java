package com.ddoubuy.order.orm.mybatis.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
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
@TableName("oms_order_item")
@ApiModel(value = "OrderItem对象", description = "")
public class OrderItem implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("ID")
      @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("产品ID")
    private Integer productId;

    @ApiModelProperty("产品名称")
    private String productName;

    @ApiModelProperty("产品图片")
    private String productPic;

    @ApiModelProperty("产品skuID")
    private Integer skuId;

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

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductPic() {
        return productPic;
    }

    public void setProductPic(String productPic) {
        this.productPic = productPic;
    }

    public Integer getSkuId() {
        return skuId;
    }

    public void setSkuId(Integer skuId) {
        this.skuId = skuId;
    }

    public String getSkuSpecs() {
        return skuSpecs;
    }

    public void setSkuSpecs(String skuSpecs) {
        this.skuSpecs = skuSpecs;
    }

    public BigDecimal getSkuOriginalPrice() {
        return skuOriginalPrice;
    }

    public void setSkuOriginalPrice(BigDecimal skuOriginalPrice) {
        this.skuOriginalPrice = skuOriginalPrice;
    }

    public BigDecimal getSkuRealPrice() {
        return skuRealPrice;
    }

    public void setSkuRealPrice(BigDecimal skuRealPrice) {
        this.skuRealPrice = skuRealPrice;
    }

    public Integer getSkuStockEnough() {
        return skuStockEnough;
    }

    public void setSkuStockEnough(Integer skuStockEnough) {
        this.skuStockEnough = skuStockEnough;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
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
        return "OrderItem{" +
        "id=" + id +
        ", productId=" + productId +
        ", productName=" + productName +
        ", productPic=" + productPic +
        ", skuId=" + skuId +
        ", skuSpecs=" + skuSpecs +
        ", skuOriginalPrice=" + skuOriginalPrice +
        ", skuRealPrice=" + skuRealPrice +
        ", skuStockEnough=" + skuStockEnough +
        ", num=" + num +
        ", status=" + status +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        "}";
    }
}
