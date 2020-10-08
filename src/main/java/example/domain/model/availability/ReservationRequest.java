package example.domain.model.availability;

import example.domain.model.customer.Customer;
import example.domain.model.product.Quantity;
import example.domain.model.product.goods.ProductItem;
import example.domain.type.datetime.DueDate;

/**
 * 予約申し込み
 */
public class ReservationRequest {
    Customer customer;
    ProductItem productItem;
    Quantity quantity;
    DueDate dueDate;
}
