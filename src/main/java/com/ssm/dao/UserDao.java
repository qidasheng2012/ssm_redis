package com.ssm.dao;

import com.ssm.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author qp
 * @date 2019/4/12 10:01
 */
@Repository
public interface UserDao {
    List<User> listUser();
}
