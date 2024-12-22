package org.example.lesson_7.service.implement;

import org.example.lesson_7.models.Order;
import org.example.lesson_7.service.inetr.*;

public class ClientServiceManagerImpl implements ClientServiceManager {

    private GetOrderService get;
    private SaveOrderService save;
    private CookOrderService cook;
    private DeliveryOrderService delivery;

    public ClientServiceManagerImpl(GetOrderService get, SaveOrderService save, CookOrderService cook, DeliveryOrderService delivery) {
        this.get = get;
        this.save = save;
        this.cook = cook;
        this.delivery = delivery;
    }

    @Override
    public void completeOrder(Order order) {
        get.getOrder(order);
        save.saveOrder(order);
        cook.cookOrder(order);
        delivery.deliverOrder(order);
        System.out.println("The order is completed.");
    }
}
