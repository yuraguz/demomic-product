package com.demomic.product.impl.model.data.catalog;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.UUID;

@Data
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
public class CatalogData {

    private UUID id;

    private String name;

    private CatalogType type;
}
