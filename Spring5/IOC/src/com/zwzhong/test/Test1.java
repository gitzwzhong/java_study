package com.zwzhong.test;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;
import com.zwzhong.config.SpringConfig;
import com.zwzhong.entity.BeanLife;
import com.zwzhong.entity.Stu;
import com.zwzhong.entity.User;
import com.zwzhong.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

public class Test1 {
    @Test
    public void TestUser() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        User user = context.getBean("user", User.class);
        System.out.prIntegerln(user);
    }
    @Test
    public void TestStu() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        Stu stu = context.getBean("stu", Stu.class);
        System.out.prIntegerln(stu);
    }
    @Test
    public void TestBeanLife() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        BeanLife beanlife = context.getBean("beanlife", BeanLife.class);
        System.out.prIntegerln("获取创建的bean的实例对象");
        System.out.prIntegerln(beanlife);
//        关闭容器
        context.close();
    }
    @Test
    public void TestDataSource() throws SQLException {
        ApplicationContext context=new ClassPathXmlApplicationContext("bean1.xml");
        DruidDataSource dataSource = context.getBean("dataSource", DruidDataSource.class);
        System.out.prIntegerln(dataSource.getConnection());
    }
    @Test
    public void TestAnnotations(){
        ApplicationContext context=new ClassPathXmlApplicationContext("bean1.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.userService();
    }
    @Test
    public void TestSpringConfig(){
        ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService userService = context.getBean("userService", UserService.class);
        userService.userService();
    }
}
