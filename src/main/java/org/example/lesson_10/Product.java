package org.example.lesson_10;

public class Product {
    private String name;
    private double price;
    private double count;

    public Product(String name, double price, double count) {
        this.name = name;
        this.price = price;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getCount() {
        return count;
    }
}
