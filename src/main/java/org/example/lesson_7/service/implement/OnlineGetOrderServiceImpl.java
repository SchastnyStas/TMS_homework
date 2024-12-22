package org.example.lesson_7.service.implement;

import org.example.lesson_7.models.Order;
import org.example.lesson_7.service.inetr.GetOrderService;

public class OnlineGetOrderServiceImpl implements GetOrderService {

    @Override
    public void getOrder(Order order) {
        System.out.println("Get online order number: " + order.getOrderNumber());

    }
}
