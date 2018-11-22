package com.windows3.cms.service;

import com.windows3.cms.dao.UserMapperCms;
import com.windows3.cms2.dao.UserMapperCms2;
import com.windows3.cms2.service.UserServiceCms2;
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
    @Autowired
    private UserMapperCms2 userMapperCms2;
    @Autowired
    private UserServiceCms2 userServiceCms2;

    @Transactional
    public String insertCms(String name, Integer age) {
        userMapperCms.insert(name, age);
//        userMapperCms2.insert(name, age);
        userServiceCms2.insertCms2(name, age);
//        int i = 1 / 0;
        return "success";
    }

}
