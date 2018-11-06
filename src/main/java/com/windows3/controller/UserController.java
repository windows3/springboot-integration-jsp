package com.windows3.controller;

import com.windows3.entity.User;
import com.windows3.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 3 on 2018/11/6.
 */
@RestController
public class UserController {
    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/findByName")
    public User findByName(String name) {
        return userMapper.findByName(name);
    }

    @RequestMapping("/insert")
    public String insert(String name, Integer age) {
        userMapper.insert(name,age);
        return "success";
    }
}
