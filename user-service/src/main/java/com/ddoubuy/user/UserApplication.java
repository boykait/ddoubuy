package com.ddoubuy.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @description:
 * @author: boykaff
 * @date: 2022-04-11-0011
 */
@ConfigurationProperties
@SpringBootApplication
@EnableFeignClients
@MapperScan("com.ddoubuy.user.dao")
public class UserApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class, args);
    }
}
