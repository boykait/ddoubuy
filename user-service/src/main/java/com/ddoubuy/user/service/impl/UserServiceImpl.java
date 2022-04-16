package com.ddoubuy.user.service.impl;

import com.ddoubuy.user.orm.mybatis.po.User;
import com.ddoubuy.user.orm.mybatis.mapper.UserMapper;
import com.ddoubuy.user.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author boykaff
 * @since 2022-04-16
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
