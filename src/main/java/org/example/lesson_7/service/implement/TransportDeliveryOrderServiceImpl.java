package org.example.lesson_7.service.implement;

import org.example.lesson_7.models.Order;
import org.example.lesson_7.service.inetr.DeliveryOrderService;

public class TransportDeliveryOrderServiceImpl implements DeliveryOrderService {

    @Override
    public void deliverOrder(Order order) {
        System.out.println("Order number: " + order.getOrderNumber()
                + " Transport deliver to " + order.getAddress());
    }
}
