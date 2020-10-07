package example.domain.model.fulfillment;

import example.domain.model.contract.Contract;

import java.util.List;

/**
 * 提供履歴
 */
public class FulfillmentHistory {
    Contract contract;
    List<FulfillmentAction> fulfillmentActions;
}
