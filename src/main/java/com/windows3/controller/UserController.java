package com.windows3.controller;

import com.windows3.cms.dao.UserMapperCms;
import com.windows3.cms2.dao.UserMapperCms2;
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
    @Autowired
    private UserMapperCms userMapperCms;
    @Autowired
    private UserMapperCms2 userMapperCms2;

    @RequestMapping("/findByName")
    public User findByName(String name) {
        return userMapper.findByName(name);
    }

    @RequestMapping("/findByNameCms")
    public User findByNameCms(String name) {
        return userMapperCms.findByName(name);
    }

    @RequestMapping("/findByNameCms2")
    public User findByNameCms2(String name) {
        return userMapperCms2.findByName(name);
    }

    @RequestMapping("/insert")
    public String insert(String name, Integer age) {
        userMapper.insert(name,age);
        return "success";
    }
    @RequestMapping("/insertCms")
    public String insertCms(String name, Integer age) {
        userMapperCms.insert(name,age);
        return "success";
    }@RequestMapping("/insertCms2")
    public String insertCms2(String name, Integer age) {
        userMapperCms2.insert(name,age);
        return "success";
    }
}
