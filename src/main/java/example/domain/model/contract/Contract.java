package example.domain.model.contract;

import example.domain.model.customer.Customer;
import example.domain.model.customer.contact.ContactMethod;
import example.domain.model.payment.Payment;
import example.domain.model.payment.PaymentMethod;
import example.domain.model.product.ServicePackage;
import example.domain.type.address.PostalAddress;
import example.domain.type.datetime.DueDate;
import example.domain.type.money.Amount;

/**
 * 契約
 */
public class Contract {
    Customer customer;
    ContactMethod contactMethod;
    PostalAddress shipTo;

    ServicePackage servicePackage;
    DueDate deliveryDate;

    Amount amount;
    PaymentMethod paymentMethod;
}
