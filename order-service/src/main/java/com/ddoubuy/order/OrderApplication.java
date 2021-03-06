package com.ddoubuy.order;

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
@SpringBootApplication
@EnableFeignClients
@ConfigurationProperties
@ComponentScan(basePackages = "com.ddoubuy")
@MapperScan("com.ddoubuy.order.orm.mybatis.mapper")
public class OrderApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class, args);
    }
}
