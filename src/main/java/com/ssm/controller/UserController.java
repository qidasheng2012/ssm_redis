package com.ssm.controller;

import com.ssm.model.User;
import com.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 用户管理controller
 * @author qp
 * @date 2019/4/12 10:10
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    /**
     * 跳转到列表页
     * @return
     */
    @RequestMapping("/toListPage")
    public String toListPage() {
        return "user/userList";
    }

    /**
     * 查询所有用户信息
     * @return
     */
    @RequestMapping("/listUser")
    @ResponseBody
    public List<User> listUser() {
        return userService.listUser();
    }
}
