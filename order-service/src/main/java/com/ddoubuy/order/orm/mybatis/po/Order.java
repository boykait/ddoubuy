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
 * @since 2022-04-17
 */
@TableName("oms_order")
@ApiModel(value = "Order对象", description = "")
public class Order implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("ID")
      @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("订单流水号")
    private String transNo;

    @ApiModelProperty("用户ID")
    private Integer userId;

    @ApiModelProperty("用户昵称")
    private String userNickname;

    @ApiModelProperty("状态")
    private String status;

    @ApiModelProperty("支付状态	create：创建	waiting：待支付	success：支付成功	fail：支付失败	auto_cancel：自动取消，比如超时未支付	manual_cancel：手动取消订单")
    private String payStatus;

    @ApiModelProperty("创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty("修改时间")
    private LocalDateTime updateTime;

    @ApiModelProperty("取消原因类型：1. 不想买了；2:选错了需要重选；3：商品有问题；4.其它")
    private String cancelType;

    @ApiModelProperty("取消说明")
    private String cancelReson;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTransNo() {
        return transNo;
    }

    public void setTransNo(String transNo) {
        this.transNo = transNo;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserNickname() {
        return userNickname;
    }

    public void setUserNickname(String userNickname) {
        this.userNickname = userNickname;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(String payStatus) {
        this.payStatus = payStatus;
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

    public String getCancelType() {
        return cancelType;
    }

    public void setCancelType(String cancelType) {
        this.cancelType = cancelType;
    }

    public String getCancelReson() {
        return cancelReson;
    }

    public void setCancelReson(String cancelReson) {
        this.cancelReson = cancelReson;
    }

    @Override
    public String toString() {
        return "Order{" +
        "id=" + id +
        ", transNo=" + transNo +
        ", userId=" + userId +
        ", userNickname=" + userNickname +
        ", status=" + status +
        ", payStatus=" + payStatus +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        ", cancelType=" + cancelType +
        ", cancelReson=" + cancelReson +
        "}";
    }
}
