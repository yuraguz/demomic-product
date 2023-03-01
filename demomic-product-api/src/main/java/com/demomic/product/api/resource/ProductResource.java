package com.demomic.product.api.resource;

import com.demomic.product.api.dto.ProductResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public interface ProductResource {

    @RequestMapping(value = "/product", method = RequestMethod.POST)
    ProductResponse createProduct();

}
