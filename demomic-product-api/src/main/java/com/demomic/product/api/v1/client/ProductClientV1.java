package com.demomic.product.api.v1.client;

import com.demomic.product.api.v1.dto.ProductFilterRequestV1;
import com.demomic.product.api.v1.dto.ProductRequestV1;
import com.demomic.product.api.v1.dto.ProductResponseV1;
import feign.QueryMap;
import jakarta.validation.Valid;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@FeignClient(value = "product-client", path = "/api/v1/products")
public interface ProductClientV1 {

    @GetMapping
    List<ProductResponseV1> findAll(@QueryMap ProductFilterRequestV1 filter);

    @GetMapping(value = "/{productId}")
    ProductResponseV1 getById(@PathVariable long productId);

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    ProductResponseV1 create(@RequestBody @Valid ProductRequestV1 productRequestV1);

    @DeleteMapping(value = "/{productId}")
    void delete(@PathVariable long productId);

    @PostMapping(value = "/{productId}/price/recalculate")
    void recalculateProductPrice(@PathVariable long productId);

    @GetMapping(value = "/{productId}/price")
    BigDecimal getActualPrice(@PathVariable long productId);
}
