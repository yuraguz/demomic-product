package com.demomic.product.api.config;

import com.demomic.product.api.v1.client.ProductClientV1;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackageClasses = ProductClientV1.class)
public class FeignConfig {

    @Bean
    public String myName() {
        return "name";
    }
}
