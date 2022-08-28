package com.zwzhong.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewController {
    @RequestMapping("/")
    public  String index(){
        return "forward:/testHello";
    }

    @RequestMapping("/testHello")
    public String testHello(){
        return "hello";
    }
    @RequestMapping("/testRedirect")
    public String testRedirect(){
        return "redirect:/testHello";
    }
}
