package example.domain.model.payment;

import example.domain.model.customer.Customer;

import java.util.List;

/**
 * 支払い履歴
 */
public class PaymentHistory {
    Customer customer;
    List<Payment> payments;
}
