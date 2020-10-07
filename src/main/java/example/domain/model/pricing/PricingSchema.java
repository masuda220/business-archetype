package example.domain.model.pricing;

import example.domain.model.product.ServiceItem;

import java.util.Map;

/**
 * 価格体系
 */
public class PricingSchema {
    Map<ServiceItem, UnitPrice> price;
}
