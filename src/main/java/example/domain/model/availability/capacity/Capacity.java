package example.domain.model.availability.capacity;

import java.util.Map;

/**
 * サービス提供能力
 */
public class Capacity {
    Map<ServiceInstance, DeliveryStatus> serviceInstances;
}
