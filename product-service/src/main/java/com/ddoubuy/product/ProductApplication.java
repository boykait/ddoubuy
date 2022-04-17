package com.ddoubuy.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @description: 商品服务启动类
 * @author: boykaff
 * @date: 2022-04-11-0011
 */
@ConfigurationProperties
@SpringBootApplication
@EnableFeignClients
@ComponentScan(basePackages = "com.ddoubuy")
@MapperScan("com.ddoubuy.product.orm.mybatis")
public class ProductApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProductApplication.class, args);
    }
}
