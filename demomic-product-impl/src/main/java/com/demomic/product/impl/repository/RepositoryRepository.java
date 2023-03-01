package com.demomic.product.impl.repository;

import com.demomic.product.impl.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface RepositoryRepository extends JpaRepository<Product, UUID> {
}
