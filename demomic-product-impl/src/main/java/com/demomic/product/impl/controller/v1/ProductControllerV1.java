package com.demomic.product.impl.controller.v1;

import com.demomic.product.api.v1.client.ProductClientV1;
import com.demomic.product.api.v1.dto.ProductFilterRequestV1;
import com.demomic.product.api.v1.dto.ProductRequestV1;
import com.demomic.product.api.v1.dto.ProductResponseV1;
import com.demomic.product.impl.facade.ProductFacade;
import com.demomic.product.impl.facade.ProductPriceFacade;
import com.demomic.product.impl.mapper.ProductMapper;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/products")
@RequiredArgsConstructor
public class ProductControllerV1 implements ProductClientV1 {

    private final ProductMapper productMapper;
    private final ProductFacade productFacade;
    private final ProductPriceFacade productPriceFacade;

    @Override
    public List<ProductResponseV1> findAll(ProductFilterRequestV1 filter) {
        var products = productFacade.findAll(productMapper.productFilterV1ToFilter(filter));
        return productMapper.productToResponseV1(products);
    }

    @Override
    @Transactional
    public ProductResponseV1 getById(long productId) {
        var product = productFacade.getProductById(productId);
        return productMapper.productToResponseV1(product);
    }

    @Override
    @Transactional
    public ProductResponseV1 create(ProductRequestV1 request) {
        var product = productFacade.createProduct(request.name());
        return productMapper.productToResponseV1(product);
    }

    @Override
    public void delete(long productId) {
        productFacade.deleteProductById(productId);
    }

    @Override
    public void recalculateProductPrice(long productId) {
        productPriceFacade.recalculateProductPrice(productId);
    }

    @Override
    public BigDecimal getActualPrice(long productId) {
        return productPriceFacade.getActualPrice(productId);
    }
}
