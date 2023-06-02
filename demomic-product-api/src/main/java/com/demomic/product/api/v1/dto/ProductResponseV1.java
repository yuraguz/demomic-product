package com.demomic.product.api.v1.dto;

import com.demomic.product.api.dto.ProductType;

public record ProductResponseV1(Long id, String name, ProductType productType) {

}
