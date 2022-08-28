package com.zwzhong.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
// @RequestMapping("/test")
public class ReqController {
    @ResponseBody
    @RequestMapping("/testMapping")
    public String testMapping(){
        return "testMapping";
    }

    @RequestMapping("/")
    public String index(){
        return "index";
    }
    @RequestMapping("/testRest/{id}")
    public String testRest(@PathVariable("id")int id){
        System.out.println(id);
        return "success";
    }
}
