package com.demomic.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@RefreshScope
@SpringBootApplication
public class DemomicProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemomicProductApplication.class, args);
    }

}
