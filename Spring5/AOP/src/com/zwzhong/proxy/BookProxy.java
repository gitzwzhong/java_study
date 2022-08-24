package com.zwzhong.proxy;

public class BookProxy {
    public void before(){
        System.out.println("在方法之前增强");
    }
}
