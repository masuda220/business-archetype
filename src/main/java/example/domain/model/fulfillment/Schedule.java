package example.domain.model.fulfillment;

import example.domain.model.contract.Contract;

import java.util.List;

/**
 * 提供予定
 */
public class Schedule {
    Contract contract;
    List<FulfillmentAction> fulfillmentActions;
}
