package com.ddoubuy.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @description:
 * @author: boykaff
 * @date: 2022-04-11-0011
 */
@ConfigurationProperties
@SpringBootApplication
@EnableFeignClients
@ComponentScan(basePackages = "com.ddoubuy")
@MapperScan("com.ddoubuy.user.orm.mybatis")
public class UserApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class, args);
    }
}
