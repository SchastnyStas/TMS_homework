package org.example.lesson_7;

import org.example.lesson_7.models.Order;
import org.example.lesson_7.service.implement.*;
import org.example.lesson_7.service.inetr.ClientServiceManager;

public class App {

    public static void main(String[] args) {
        Order deliveryOrder = new Order("Leopold Myagkov", "Friendship Street, 1");
        Order takeAwayOrder = new Order("Sharik Pesikov");

        ClientServiceManager onlineDeliveryService = new ClientServiceManagerImpl(new OnlineGetOrderServiceImpl(), new SaveOrderServiceImpl(), new CookOrderServiceImpl(), new TransportDeliveryOrderServiceImpl());
        onlineDeliveryService.completeOrder(deliveryOrder);
        System.out.println("__________________________________");
        ClientServiceManager phoneTakeAwayService = new ClientServiceManagerImpl(new PhoneGetOrderServiceImpl(), new SaveOrderServiceImpl(), new CookOrderServiceImpl(), new WindowDeliveryOrderServiceImpl());
        phoneTakeAwayService.completeOrder(takeAwayOrder);
    }
}
