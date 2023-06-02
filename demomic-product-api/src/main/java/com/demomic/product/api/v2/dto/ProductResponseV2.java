package com.demomic.product.api.v2.dto;

import com.demomic.product.api.dto.ProductType;

public record ProductResponseV2(Long id, String name, ProductType productType) {

}
