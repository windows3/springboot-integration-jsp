package com.windows3.cms2.service;

import com.windows3.cms.dao.UserMapperCms;
import com.windows3.cms2.dao.UserMapperCms2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by 3 on 2018/11/16.
 */
@Service
public class UserServiceCms2 {
    @Autowired
    private UserMapperCms2 userMapperCms2;

    @Transactional
    public  String insertCms2(String name,Integer age){
        userMapperCms2.insert(name,age);
//        int i=1/0;
        return "success";
    }

    @Async
    public  void  sendMsg(){
        System.out.println("####3####");
        System.out.println("####4####");
    }

}
