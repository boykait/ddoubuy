package com.ddoubuy.user.model.po;

import com.baomidou.mybatisplus.annotation.TableName;
import com.ddoubuy.common.model.Basic;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @description: 用户
 * @author: boykaff
 * @date: 2022-04-15-0015
 */
@EqualsAndHashCode(callSuper = true)
@Data
@TableName(value = "ums_user")
public class User extends Basic {
    private Long id;
    private String nickname;
    private String phone;
    private String email;
    private String password;
    private String gender;
    private String poster;
    private String source;
}
