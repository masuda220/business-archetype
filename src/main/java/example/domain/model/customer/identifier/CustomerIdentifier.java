package example.domain.model.customer.identifier;

import example.domain.model.customer.Customer;
import example.domain.model.customer.profile.DateOfBirth;
import example.domain.model.customer.profile.Gender;
import example.domain.type.address.PostalAddress;
import example.domain.type.address.TelephoneNumber;

/**
 * 本人確認
 */
public class CustomerIdentifier {
    Customer customer;
    TelephoneNumber telephoneNumber;
    PostalAddress postalAddress;
    DateOfBirth dateOfBirth;
    Gender gender;
}
