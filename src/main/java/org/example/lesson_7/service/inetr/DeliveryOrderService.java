package org.example.lesson_7.service.inetr;

import org.example.lesson_7.models.Order;

public interface DeliveryOrderService {

    default void deliverOrder(Order order) {
        System.out.println("Take away.");
    }
}
