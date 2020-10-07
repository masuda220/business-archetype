package example.domain.model.customer.contact;

import example.domain.type.address.MailAddress;
import example.domain.type.address.SNSAddress;
import example.domain.type.address.TelephoneNumber;

/**
 * 連絡先
 */
public class ContactAddress {
    TelephoneNumber telephoneNumber;
    MailAddress mailAddress;
    SNSAddress snsAddress;
}
