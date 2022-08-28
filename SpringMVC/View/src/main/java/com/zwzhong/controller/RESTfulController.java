package com.zwzhong.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RESTfulController {
    @RequestMapping("/RESTful")
    public String RESTful(){
        return "restful";
    }
    @ResponseBody
    @RequestMapping(value="/testRESTful",method = RequestMethod.PUT)
    public String testRESTful(){
        return "put method";
    }
}
