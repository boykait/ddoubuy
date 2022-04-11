package com.ddoubuy.order.common.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @description:
 * @author: boykaff
 * @date: 2022-04-11-0011
 */
@Configuration
public class ApplicationContentConfig {
    @Bean
    @LoadBalanced  //负载均衡
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
