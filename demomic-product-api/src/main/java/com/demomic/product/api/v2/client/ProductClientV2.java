package com.demomic.product.api.v2.client;

import com.demomic.product.api.v2.dto.ProductFilterRequestV2;
import com.demomic.product.api.v2.dto.ProductRequestV2;
import com.demomic.product.api.v2.dto.ProductResponseV2;
import feign.QueryMap;
import jakarta.validation.Valid;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@FeignClient(value = "product-client", path = "/api/v1/napolke/products")
public interface ProductClientV2 {

    @GetMapping
    List<ProductResponseV2> findAll(@QueryMap ProductFilterRequestV2 filter);

    @GetMapping(value = "/{productId}")
    ProductResponseV2 getById(@PathVariable long productId);

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    ProductResponseV2 create(@RequestBody @Valid ProductRequestV2 productRequestV1);

    @DeleteMapping(value = "/{productId}")
    void delete(@PathVariable long productId);

    @PostMapping(value = "/{productId}/price/recalculate")
    void recalculateProductPrice(@PathVariable long productId);

    @GetMapping(value = "/{productId}/price")
    BigDecimal getActualPrice(@PathVariable long productId);
}
