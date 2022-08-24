package com.zwzhong.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"com.zwzhong"})
@EnableAspectJAutoProxy//开启代理对象
public class configAop {
}
