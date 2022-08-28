package com.zwzhong.controller;

import com.zwzhong.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GetParamsController {
    @RequestMapping("/testParams")
    public String testParmas(String username,String password){
        System.out.println("用户名:"+username+" 密码:"+password);
        return "success";
    }
    @RequestMapping("/testPojo")
    public String testPojo(User user){
        System.out.println(user);
        return "success";
    }
}
