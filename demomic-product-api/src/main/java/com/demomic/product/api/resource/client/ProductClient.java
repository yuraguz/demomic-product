package com.demomic.product.api.resource.client;

import com.demomic.product.api.resource.ProductResource;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "DemomicProductClient",
        url = "http://localhost:8088")
public interface ProductClient extends ProductResource {
}
