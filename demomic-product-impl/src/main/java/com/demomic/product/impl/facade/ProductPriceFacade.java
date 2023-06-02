package com.demomic.product.impl.facade;

import com.demomic.product.impl.service.adapter.CatalogAdapter;
import com.demomic.product.impl.repository.ProductRepository;
import com.demomic.product.impl.service.ProductPriceCalculator;
import com.demomic.product.impl.service.notification.NotificationEvent;
import com.demomic.product.impl.service.notification.NotificationService;
import com.demomic.product.impl.service.notification.builder.NotificationPayloadBuilder;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
@RequiredArgsConstructor
public class ProductPriceFacade {

    private final ProductPriceCalculator productPriceCalculator;
    private final ProductRepository productRepository;
    private final CatalogAdapter catalogAdapter;
    private final NotificationService notificationService;

    /**
     * Перерасчет цены продукта
     *
     * @param productId идентификатор продукта
     */
    public void recalculateProductPrice(long productId) {
        var product = productRepository.findById(productId).orElseThrow(() -> new EntityNotFoundException("Some text"));
        productPriceCalculator.recalculateProductPrice(product);
        notificationService.sendEvent(NotificationEvent.PRODUCT_PRICE_RECALCULATED, NotificationPayloadBuilder
                .productPayloadBuilder(product));
    }

    /**
     * Получение актуальной цены продукта
     *
     * @param productId идентификатор продукта
     * @return актуальная цена
     */
    public BigDecimal getActualPrice(long productId) {
        var product = productRepository.findById(productId).orElseThrow(() -> new EntityNotFoundException("Some text"));
        var productCatalog = catalogAdapter.getCatalogByFilterV1(productId);
        return productPriceCalculator.calculateActualPrice(product, productCatalog);
    }
}
