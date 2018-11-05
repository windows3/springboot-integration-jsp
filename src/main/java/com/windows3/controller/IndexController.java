package com.windows3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by 3 on 2018/11/5.
 */
@Controller
public class IndexController {
    @RequestMapping("/index")
    public  String index(){
        return "index";
    }
}
