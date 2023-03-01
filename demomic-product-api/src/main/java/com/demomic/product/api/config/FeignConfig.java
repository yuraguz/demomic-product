package com.demomic.product.api.config;

import com.demomic.product.api.resource.client.ProductClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackageClasses = ProductClient.class)
public class FeignConfig {

    @Bean
    public String myName() {
        return "name";
    }
}
