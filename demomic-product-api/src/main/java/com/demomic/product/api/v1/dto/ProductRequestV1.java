package com.demomic.product.api.v1.dto;

import jakarta.validation.constraints.NotBlank;

public record ProductRequestV1(@NotBlank(message = "Book must have name") String name) {
}
