package com.zwzhong.dao.imp;

import com.zwzhong.dao.UserDao;

public class UserDaoImp implements UserDao {
    @Override
    public String login(String username,String password) {
        System.out.println("登录方法");
        return username+" "+password;
    }
}
