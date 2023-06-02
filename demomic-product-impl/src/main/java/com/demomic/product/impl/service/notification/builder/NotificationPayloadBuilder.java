package com.demomic.product.impl.service.notification.builder;

import com.demomic.product.impl.model.entity.Product;

import java.util.function.Supplier;

public interface NotificationPayloadBuilder {

    static Supplier<String> productPayloadBuilder(Product product) {
        return (() -> product.toString());
    }
}
