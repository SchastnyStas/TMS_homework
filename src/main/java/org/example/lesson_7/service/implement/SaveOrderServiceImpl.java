package org.example.lesson_7.service.implement;

import org.example.lesson_7.models.Order;
import org.example.lesson_7.service.inetr.SaveOrderService;

public class SaveOrderServiceImpl implements SaveOrderService {

    @Override
    public void saveOrder(Order order) {
        if (order.getAddress() != null) {
            System.out.println("Save Order number: " + order.getOrderNumber()
                    + ", Full Name: " + order.getClientFullName()
                    + ", Address: " + order.getAddress());
        } else {
            System.out.println("Save Order number: " + order.getOrderNumber()
                    + ", Full Name: " + order.getClientFullName());

        }
    }
}