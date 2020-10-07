package example.domain.model.customer.linkage;

import example.domain.model.customer.Customer;

/**
 * 顧客間の関係
 */
public class Linkage {
    LinkageType linkageType;
    Customer one;
    Customer another;
}
