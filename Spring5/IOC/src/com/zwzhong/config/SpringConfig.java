package com.zwzhong.config;

import com.zwzhong.entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//说明该类是一个配置类
@Configuration
@ComponentScan(basePackages = {"com.zwzhong"})
public class SpringConfig {
    @Bean
    public User user(){
        return  new User();
    }
}
