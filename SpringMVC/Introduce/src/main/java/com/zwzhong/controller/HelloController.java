package com.zwzhong.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//说明该类是一个控制类
@Controller
public class HelloController {

    @RequestMapping("/")
    public String index(){
        return "index";
    }
    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }
}
