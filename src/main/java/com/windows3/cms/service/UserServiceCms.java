package com.windows3.cms.service;

import com.windows3.cms.dao.UserMapperCms;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by 3 on 2018/11/16.
 */
@Service
public class UserServiceCms {
    @Autowired
    private UserMapperCms userMapperCms;

    @Transactional
    public  String insertCms(String name,Integer age){
        userMapperCms.insert(name,age);
        int i=1/0;
        return "success";
    }

}
