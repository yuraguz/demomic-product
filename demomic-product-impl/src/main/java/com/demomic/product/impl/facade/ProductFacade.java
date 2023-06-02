package com.demomic.product.impl.facade;

import com.demomic.product.impl.model.data.ProductFilter;
import com.demomic.product.impl.model.entity.Product;
import com.demomic.product.impl.repository.ProductRepository;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

import static java.lang.String.format;

@Service
@RequiredArgsConstructor
public class ProductFacade {

    private final ProductRepository productRepository;

    /**
     * Получение продукта по его идентификатору
     *
     * @param productId идентификатор продукта
     * @return данные по продукту
     */
    public Product getProductById(long productId) {
        return productRepository.findById(productId)
                .orElseThrow(() -> new EntityNotFoundException(format("No such product with id = %s", productId)));
    }

    /**
     * Поиск продуктов
     *
     * @return список найденных продуктов
     */
    public List<Product> findAll(ProductFilter filter) {
        /*
            Build filter logic
         */
        return productRepository.findAll();
    }

    @Transactional
    public Product createProduct(String productName) {
        return productRepository.save(new Product().setName(productName));
    }

    @Transactional
    public void deleteProductById(long productId) {
        productRepository.deleteById(productId);
    }
}
