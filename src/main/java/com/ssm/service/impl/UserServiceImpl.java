package com.ssm.service.impl;

import com.ssm.dao.UserDao;
import com.ssm.model.User;
import com.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author qp
 * @date 2019/4/12 10:04
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> listUser() {
        return userDao.listUser();
    }
}
