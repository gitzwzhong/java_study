package com.zwzhong.test;

import com.zwzhong.dao.imp.UserDaoImp;
import com.zwzhong.entity.User;
import com.zwzhong.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import java.util.List;

public class TestDao {
    @Test
    public void testAdd(){
        ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
        UserService userService = context.getBean("userService", UserService.class);
        User user=new User(null,"王五","222");
        userService.addUser(user);
    }
    @Test
    public void testUpdate(){
        ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
        UserService userService = context.getBean("userService", UserService.class);
        User user=new User(1,"李四","123456");
        int res=userService.updateUser(user);
        System.out.println(res);
    }
    @Test
    public void testDelete(){
        ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
        UserService userService = context.getBean("userService", UserService.class);
        int res=userService.deleteUser(2);
        System.out.println(res);
    }
    @Test
    public void testQueryOneUser(){
        ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
        UserService userService = context.getBean("userService", UserService.class);
        User user =userService.queryOneUser(1);
        System.out.println(user);
    }
    @Test
    public void testQueryAllUser(){
        ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
        UserService userService = context.getBean("userService", UserService.class);
        List<User> userList= userService.queryForUserList();
        System.out.println(userList);
    }
}
