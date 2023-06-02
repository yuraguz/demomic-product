package com.demomic.product.impl.controller.v2;

import com.demomic.product.api.v2.client.ProductClientV2;
import com.demomic.product.api.v2.dto.ProductFilterRequestV2;
import com.demomic.product.api.v2.dto.ProductRequestV2;
import com.demomic.product.api.v2.dto.ProductResponseV2;
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
@RequestMapping(value = "/api/v2/napolke/products")
@RequiredArgsConstructor
public class ProductControllerV2 implements ProductClientV2 {

    private final ProductMapper productMapper;
    private final ProductFacade productFacade;
    private final ProductPriceFacade productPriceFacade;

    @Override
    public List<ProductResponseV2> findAll(ProductFilterRequestV2 filter) {
        var products = productFacade.findAll(productMapper.productFilterV2ToFilter(filter));
        return productMapper.productToResponseV2(products);
    }

    @Override
    @Transactional
    public ProductResponseV2 getById(long productId) {
        var product = productFacade.getProductById(productId);
        return productMapper.productToResponseV2(product);
    }

    @Override
    @Transactional
    public ProductResponseV2 create(ProductRequestV2 request) {
        var product = productFacade.createProduct(request.name());
        return productMapper.productToResponseV2(product);
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
