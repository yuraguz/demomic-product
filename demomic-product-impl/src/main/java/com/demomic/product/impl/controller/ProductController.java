package com.demomic.product.impl.controller;

import com.demomic.product.api.dto.ProductResponse;
import com.demomic.product.api.resource.ProductResource;
import com.demomic.product.impl.mapper.ProductMapper;
import com.demomic.product.impl.model.Product;
import com.demomic.product.impl.repository.RepositoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequiredArgsConstructor
public class ProductController implements ProductResource {

    private final ProductMapper productMapper;
    private final RepositoryRepository repositoryRepository;

    @Override
    public ProductResponse createProduct() {
        var product = repositoryRepository.save(new Product(UUID.randomUUID(), "test name"));
        return productMapper.productToRespone(product);
    }
}
