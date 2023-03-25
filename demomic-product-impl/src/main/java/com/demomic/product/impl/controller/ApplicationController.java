package com.demomic.product.impl.controller;

import com.demomic.product.api.resource.ApplicationResource;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ApplicationController implements ApplicationResource {

    @Value("${example.property}")
    private final String exampleProperty;

    @Override
    public String getExampleConfigProperty() {
        return exampleProperty;
    }
}
