package example.domain.model.availability;

import example.domain.model.product.Quantity;

import java.util.Map;

/**
 * 在庫
 */
public class Inventory {
    Map<InventoryEntry, Quantity> map;
}
