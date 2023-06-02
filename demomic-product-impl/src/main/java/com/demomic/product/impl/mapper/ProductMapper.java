package com.demomic.product.impl.mapper;

import com.demomic.product.api.v1.dto.ProductFilterRequestV1;
import com.demomic.product.api.v1.dto.ProductResponseV1;
import com.demomic.product.api.v2.dto.ProductFilterRequestV2;
import com.demomic.product.api.v2.dto.ProductResponseV2;
import com.demomic.product.impl.model.data.ProductFilter;
import com.demomic.product.impl.model.entity.Product;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    ProductFilter productFilterV1ToFilter(ProductFilterRequestV1 filterV1);

    ProductResponseV1 productToResponseV1(Product product);

    List<ProductResponseV1> productToResponseV1(List<Product> products);

    ProductFilter productFilterV2ToFilter(ProductFilterRequestV2 filterV2);

    ProductResponseV2 productToResponseV2(Product product);

    List<ProductResponseV2> productToResponseV2(List<Product> products);

}
