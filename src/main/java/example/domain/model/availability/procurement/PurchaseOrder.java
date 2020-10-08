package example.domain.model.availability.procurement;

import example.domain.model.availability.InventoryEntry;
import example.domain.model.product.Quantity;
import example.domain.type.datetime.DueDate;

/**
 * 購買注文
 */
public class PurchaseOrder {
    InventoryEntry inventoryItem;
    Quantity quantity;
    DueDate dueDate;
}
