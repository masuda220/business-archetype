package example.domain.model.availability;

import example.domain.model.product.Quantity;
import example.domain.type.datetime.DueDate;

/**
 * 予約
 */
public class Reservation {
    ReservationRequest reservationRequest;
    InventoryEntry inventoryEntry;
    Quantity quantity;
    DueDate dueDate;
}
