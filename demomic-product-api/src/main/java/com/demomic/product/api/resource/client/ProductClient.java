package com.demomic.product.api.resource.client;

import com.demomic.product.api.resource.ProductResource;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("demomic-product")
public interface ProductClient extends ProductResource {
}
