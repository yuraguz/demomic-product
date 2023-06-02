package com.demomic.product.api.v2.dto;

import jakarta.validation.constraints.NotBlank;

public record ProductRequestV2(@NotBlank(message = "Book must have name") String name) {
}
