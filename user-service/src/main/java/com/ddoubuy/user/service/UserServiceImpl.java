package com.ddoubuy.user.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ddoubuy.user.dao.UserMapper;
import com.ddoubuy.user.model.po.User;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author: boykaff
 * @date: 2022-04-15-0015
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
