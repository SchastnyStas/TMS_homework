package org.example.lesson_7.models;

import java.util.Random;

public class Order {

    private int orderNumber;
    private String clientFullName;
    private String address;


    public Order(String clientFullName, String address) {
        this.orderNumber = new Random().nextInt(100);
        this.clientFullName = clientFullName;
        this.address = address;
    }

    public Order(String clientFullName) {
        this.orderNumber = new Random().nextInt(100);
        this.clientFullName = clientFullName;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public String getClientFullName() {
        return clientFullName;
    }

    public String getAddress() {
        return address;
    }
}
