package com.zwzhong.test;

import com.zwzhong.config.configAop;
import com.zwzhong.dao.imp.UserDaoImp;
import com.zwzhong.entity.Book;
import com.zwzhong.entity.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAop {
    @Test
    public void TestProxy(){
        ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
        User user = context.getBean("user", User.class);
        user.login();
    }
    @Test
    public void TestConfigAop(){
        ApplicationContext context=new AnnotationConfigApplicationContext(configAop.class);
        User user = context.getBean("user", User.class);
        user.login();
    }
    @Test
    public void TestBaseXml(){
        ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
        Book book = context.getBean("book", Book.class);
        book.addBook();
    }
}
