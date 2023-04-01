package com.demomic.product.impl.controller;

import com.demomic.product.api.resource.ApplicationResource;
import com.demomic.product.impl.properties.ApplicationProperties;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ApplicationController implements ApplicationResource {

    private final ApplicationProperties applicationProperties;

    @Override
    public String getExampleConfigProperty() {
        return applicationProperties.getGreetingMessage();
    }
}
