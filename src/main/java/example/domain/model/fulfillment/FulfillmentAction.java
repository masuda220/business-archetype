package example.domain.model.fulfillment;

import example.domain.model.product.ServiceItem;
import example.domain.type.datetime.DueDate;

/**
 * サービス提供
 */
public class FulfillmentAction {
    ServiceItem serviceItem;
    ActionType actionType;
    DueDate dueDate;
}
