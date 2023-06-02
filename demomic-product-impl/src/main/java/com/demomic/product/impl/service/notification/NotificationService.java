package com.demomic.product.impl.service.notification;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.function.Supplier;

@Service
@RequiredArgsConstructor
public class NotificationService {

    public <T> void sendEvent(NotificationEvent event, Supplier<String> payloadBuilder) {
        var payload = payloadBuilder.get();
        // some logic for building and sending event to message broker
    }
}
