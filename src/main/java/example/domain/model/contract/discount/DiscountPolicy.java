package example.domain.model.contract.discount;

import example.domain.model.product.services.ServiceItem;
import example.domain.type.money.Amount;
import example.domain.type.money.Percent;

import java.util.Map;

/**
 * 割引ポリシー
 */
public class DiscountPolicy {
    Map<ServiceItem, DiscountType> discountTypeMap;
    Map<ServiceItem, Amount> amountDiscount;
    Map<ServiceItem, Percent> rateDiscount;
}
