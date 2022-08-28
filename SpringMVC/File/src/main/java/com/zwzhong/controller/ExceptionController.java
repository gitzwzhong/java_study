package com.zwzhong.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ExceptionController {
    @ResponseBody
    @RequestMapping("/testException")
    public String testException(Model model,Exception ex){
        int c=10/0;
        model.addAttribute("ex",ex);
        return "success";
    }
}
