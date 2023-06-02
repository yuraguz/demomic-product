package com.demomic.product.api.v1.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "a-product", path = "/app")
public interface ApplicationClientV1 {

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    String getExampleConfigProperty();
}
