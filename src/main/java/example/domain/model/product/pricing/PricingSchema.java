package example.domain.model.product.pricing;

import example.domain.model.product.goods.ProductItem;
import example.domain.model.product.services.ServiceItem;

import java.util.Map;

/**
 * 価格体系
 */
public class PricingSchema {
    Map<ProductItem, UnitPrice> productPrices;
    Map<ServiceItem, UnitPrice> servicePrices;
}
