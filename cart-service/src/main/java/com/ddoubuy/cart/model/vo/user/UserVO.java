package com.ddoubuy.cart.model.vo.user;

import com.ddoubuy.common.model.Basic;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * 用户VO对象
 *
 * @author boykaff
 * @since 2022-04-16
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class UserVO extends Basic implements Serializable {

    private static final long serialVersionUID = 1L;

    private String nickname;

    private String phone;

    private String email;

    private String password;

    private String gender;

    private String poster;

    private String source;
}
