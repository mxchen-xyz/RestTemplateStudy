package com.jincou.user.service.impl;

import com.jincou.user.dao.UserMapper;
import com.jincou.user.service.UserService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

/**
 * @author hmxchen
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

}
