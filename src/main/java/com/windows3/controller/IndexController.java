package com.windows3.controller;

import com.windows3.cms.dao.UserMapperCms;
import com.windows3.cms.service.UserServiceCms;
import com.windows3.cms2.dao.UserMapperCms2;
import com.windows3.cms2.service.UserServiceCms2;
import com.windows3.mapper.UserMapper;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by 3 on 2018/11/5.
 */
@Controller
public class IndexController {
//    log4j代码
    private static Logger log = Logger.getLogger(IndexController.class);


    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UserMapperCms userMapperTest01;
    @Autowired
    private UserMapperCms2 userMapperTest02;
    @Autowired
    private UserServiceCms userServiceTest01;

    @Autowired
    private UserServiceCms2 userServiceTest02;

    @Value("windows3")
    private  String windows3;


    @RequestMapping("/index")
    public String index() {
        return "index";
    }




    @ResponseBody
    @RequestMapping("/insertTest001")
    public String insertTest001(String name, Integer age) {
        userServiceTest01.insertCms(name, age);
        return "success";
    }

    @ResponseBody
    @RequestMapping("/sendMsg")
    public String sendMsg(){
        System.out.println("####1####");
        userServiceTest02.sendMsg();
        System.out.println("####2####");
        return "success";
    }

    @ResponseBody
    @RequestMapping("/getWindows3")
    public String getWindows3(){

        return windows3;
    }

}
