package com.zwzhong.service;

import com.zwzhong.dao.UserDaoImp.UserDaoImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value="userService")//默认id为类小写
public class UserService {
//    自动注入
    @Autowired
    UserDaoImp userDaoImp;

    public void userService(){
        System.out.println("service层");
        userDaoImp.userDao();
    }
}
