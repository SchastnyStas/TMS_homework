package org.example.lesson_7.service.implement;

import org.example.lesson_7.models.Order;
import org.example.lesson_7.service.inetr.CookOrderService;

public class CookOrderServiceImpl implements CookOrderService {

    @Override
    public void cookOrder(Order order) {
        System.out.println("Order number: " + order.getOrderNumber() + " is cooking");
    }
}
