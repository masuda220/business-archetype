package example.domain.model.availability.capacity;

import example.domain.model.product.services.ServiceItem;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 * 提供単位
 */
public class ServiceInstance {
    ServiceItem serviceItem;
    LocalDate date;
    LocalTime start;
    LocalTime end;
}
