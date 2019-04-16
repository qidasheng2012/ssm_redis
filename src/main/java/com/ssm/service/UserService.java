package com.ssm.service;

import com.ssm.model.User;

import java.util.List;

/**
 * 用户管理service
 * @author qp
 * @date 2019/4/12 10:03
 */
public interface UserService {
    /**
     * 查询所有用户
     * @return
     */
    List<User> listUser();
}
