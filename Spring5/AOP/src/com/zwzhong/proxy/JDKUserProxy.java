package com.zwzhong.proxy;

import com.zwzhong.dao.UserDao;
import com.zwzhong.dao.imp.UserDaoImp;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

//使用Proxy类创建接口代理对象
public class JDKUserProxy {
    public static void main(String[] args) {
        Class[]Integererfaces={UserDao.class};
//      创建子类的实现
        UserDaoImp userDaoImp=new UserDaoImp();
        UserDao userDao=(UserDao) Proxy.newProxyInstance(JDKUserProxy.class.getClassLoader(),
                                                                Integererfaces,new UserDaoProxy(userDaoImp));
        userDao.login("zwzhong","123456");
    }
}
//创建代理对象
class UserDaoProxy implements InvocationHandler {
    private Object obj;
    public UserDaoProxy(Object obj){
        this.obj=obj;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.prIntegerln("login方法执行之前");
        Object res=method.invoke(obj,args);
        System.out.prIntegerln("login方法执行之后");
        return res;
    }
}
