package example.domain.model.fulfillment;

import example.domain.model.contract.Contract;

/**
 * 契約の履行の進捗
 */
public class Progress {
    Contract contract;
    Schedule schedule;
    FulfillmentHistory fulfillmentHistory;
}
