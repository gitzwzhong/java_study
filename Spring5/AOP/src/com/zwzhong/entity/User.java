package com.zwzhong.entity;

import org.springframework.stereotype.Component;

@Component
public class User {
    public void login(){
        System.out.prIntegerln("需要被增强的方法");
//        制造异常,观察环绕通知
//        Integer a=10/0;
    }
}
