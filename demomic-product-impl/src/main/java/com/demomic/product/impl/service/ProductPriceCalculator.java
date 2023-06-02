package com.demomic.product.impl.service;

import com.demomic.product.impl.model.data.catalog.CatalogData;
import com.demomic.product.impl.model.entity.Product;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
@RequiredArgsConstructor
public class ProductPriceCalculator {

    @Transactional
    public BigDecimal recalculateProductPrice(Product product) {
        /*
            Some business logic
         */
        return BigDecimal.TEN;
    }

    public BigDecimal calculateActualPrice(Product product, CatalogData catalog) {
        /*
            Some logic with catalog type strategies
         */
        return BigDecimal.TEN;
    }
}
