package com.ddoubuy.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * @description: 网关服务
 * @author: boykaff
 * @date: 2022-04-17-0017
 */
@ConfigurationProperties
@SpringBootApplication(exclude= DataSourceAutoConfiguration.class )
@EnableDiscoveryClient
@ComponentScan(basePackages = "com.ddoubuy")
public class GatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class, args);
    }
}
