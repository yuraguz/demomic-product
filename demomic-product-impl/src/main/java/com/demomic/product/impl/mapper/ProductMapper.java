package com.demomic.product.impl.mapper;

import com.demomic.product.api.dto.ProductResponse;
import com.demomic.product.impl.model.Product;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    ProductResponse productToRespone(Product product);
}
