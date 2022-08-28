package com.zwzhong.config;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

//异常注解
// @ControllerAdvice
public class ExceptionConfig {
    //@ExceptionHandler用于设置所标识方法处理的异常,这里可以指定具体的异常
    @ExceptionHandler({Exception.class})
    //ex表示当前请求处理中出现的异常对象
    public String handleException(Exception ex, Model model){
        model.addAttribute("ex", ex);
        return "error";
    }
}
