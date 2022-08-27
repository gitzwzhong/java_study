package com.zwzhong.entity;

public class BeanLife {
    private String beanname;

    public BeanLife() {
        System.out.prIntegerln("构造器方法执行");
    }

    public BeanLife(String beanname) {
        this.beanname = beanname;
    }

    public void initMethod(){
        System.out.prIntegerln("init方法执行");
    }
    public void destory(){
        System.out.prIntegerln("destory方法执行");
    }
    public String getBeanname() {
        return beanname;
    }

    public void setBeanname(String beanname) {
        System.out.prIntegerln("set方法执行");
        this.beanname = beanname;
    }

    @Override
    public String toString() {
        return "BeanLife{" +
                "beanname='" + beanname + '\'' +
                '}';
    }
}
