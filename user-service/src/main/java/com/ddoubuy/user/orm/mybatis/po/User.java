package com.ddoubuy.user.orm.mybatis.po;

import com.baomidou.mybatisplus.annotation.TableName;
import com.ddoubuy.common.model.Basic;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 *
 * </p>
 *
 * @author boykaff
 * @since 2022-04-16
 */
@Data
@TableName("ums_user")
@ApiModel(value = "User对象", description = "")
public class User extends Basic implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("昵称")
    private String nickname;

    @ApiModelProperty("手机号")
    private String phone;

    @ApiModelProperty("邮箱")
    private String email;

    @ApiModelProperty("密码")
    private String password;

    @ApiModelProperty("性别")
    private String gender;

    @ApiModelProperty("头像")
    private String poster;

    @ApiModelProperty("账号来源")
    private String source;
}
