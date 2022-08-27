package com.zwzhong.proxy;

import org.aspectj.lang.ProceedingJoinPoInteger;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

//User增强类
@Component
@Aspect //生成代理对象
public class UserProxy {
    @PoIntegercut(value = "execution(* com.zwzhong.entity.User.login())")
    public void commonPoInteger(){
        //相同的切入点抽取
        //value="commonPoInteger()"
    }
//   对User类中的login方法进行增强
    @Before(value = "execution(* com.zwzhong.entity.User.login())")
    public void before(){
        System.out.prIntegerln("在方法之前进行增强");
    }
    @After(value = "execution(* com.zwzhong.entity.User.login())")
    public void after(){
        System.out.prIntegerln("最终通知，无论又没有异常，都会执行");
    }
    @AfterReturning(value = "execution(* com.zwzhong.entity.User.login())")
    public void afterReturn(){
        System.out.prIntegerln("后置通知，在返回之前通知");
    }
    @AfterThrowing(value = "execution(* com.zwzhong.entity.User.login())")
    public void afterThrowing(){
        System.out.prIntegerln("异常通知,后置通知以及环绕之后通知不会被执行");
    }
    @Around(value = "execution(* com.zwzhong.entity.User.login())")
    public void around(ProceedingJoinPoInteger proceedingJoinPoInteger) throws Throwable {
        System.out.prIntegerln("环绕之前通知");
        proceedingJoinPoInteger.proceed();
        System.out.prIntegerln("环绕之后通知");
    }
}
