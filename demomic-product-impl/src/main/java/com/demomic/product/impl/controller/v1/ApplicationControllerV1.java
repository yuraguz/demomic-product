package com.demomic.product.impl.controller.v1;

import com.demomic.product.api.v1.client.ApplicationClientV1;
import com.demomic.product.impl.properties.ApplicationProperties;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ApplicationControllerV1 implements ApplicationClientV1 {

    private final ApplicationProperties applicationProperties;

    @Override
    public String getExampleConfigProperty() {
        return applicationProperties.getGreetingMessage();
    }
}
