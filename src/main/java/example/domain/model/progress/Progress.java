package example.domain.model.progress;

import example.domain.model.contract.Contract;
import example.domain.model.fulfillment.FulfillmentHistory;
import example.domain.model.fulfillment.Schedule;
import example.domain.model.payment.PaymentHistory;

/**
 * 契約の履行の進捗
 */
public class Progress {
    Contract contract;
    Schedule schedule;
    FulfillmentHistory fulfillmentHistory;
    PaymentHistory paymentHistory;
}
