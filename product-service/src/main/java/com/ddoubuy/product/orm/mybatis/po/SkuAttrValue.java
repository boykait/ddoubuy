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
@TableName("pms_sku_attr_value")
@ApiModel(value = "SkuAttrValue对象", description = "")
public class SkuAttrValue implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("ID")
      @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("商品sku属性值")
    private String value;

    @ApiModelProperty("商品sku属性key的ID")
    private String skuAttrId;

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

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getSkuAttrId() {
        return skuAttrId;
    }

    public void setSkuAttrId(String skuAttrId) {
        this.skuAttrId = skuAttrId;
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
        return "SkuAttrValue{" +
        "id=" + id +
        ", value=" + value +
        ", skuAttrId=" + skuAttrId +
        ", status=" + status +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        "}";
    }
}
