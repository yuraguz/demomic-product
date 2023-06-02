package com.demomic.product.impl.service.adapter;

import com.demomic.product.impl.model.data.catalog.CatalogData;
import com.demomic.product.impl.model.data.catalog.CatalogType;
import org.springframework.stereotype.Service;

@Service
public class CatalogAdapter {

    // private final CatalogClient catalogClient;       -- FeignClient
    // private final CatalogAdapterMapper mapper;

    public CatalogData getCatalogByFilterV1(long productId) {
        // var catalogV1 = catalogClient.findWithFilter({...});
        // return mapper.catalogV1ToCatalog(catalogV1);
        return new CatalogData();
    }

    public CatalogData getCatalogByFilterV2(long productId) {
        // var catalogV2 = catalogClient.findWithFilter({...});
        // return mapper.catalogV1ToCatalog(catalogV2);
        return new CatalogData();
    }

    public CatalogData getCatalogByFilter(long productId) {

        /*
        var version = setting.getCatalogApiVersion();
        switch(version) {
            case V1: {
                var catalogV1 = catalogClient.findWithFilter({...});
                return mapper.catalogV1ToCatalog(catalogV1);
            },
            case V2: {
                var catalogV2 = catalogClient.findWithFilter({...});
                return mapper.catalogV1ToCatalog(catalogV2);
            },
            default: {
                throw new RuntimeException("No api settings");
            }
        }
         */

        return new CatalogData();
    }
}
