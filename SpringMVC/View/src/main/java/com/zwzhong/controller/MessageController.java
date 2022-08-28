package com.zwzhong.controller;

import com.zwzhong.entity.User;
import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MessageController {
    @RequestMapping("/message")
    public String message(){
        return "message";
    }
    @ResponseBody
    @RequestMapping("/testRequestBody")
    public String testRequestBody(@RequestBody String requestBody){
        return requestBody;
    }

    @ResponseBody
    @RequestMapping("/testRequestEntity")
    public String testRequestEntity(RequestEntity<String> requestEntity){
        return requestEntity.getHeaders().toString();
    }

    @ResponseBody
    @RequestMapping("/testResponseBody")
    public String testResponseBody(){
        return "testResponseBody";
    }

    @ResponseBody
    @RequestMapping("/testJson")
    public User testJson(){
        return new User(1000,"张三","123456");
    }
}
