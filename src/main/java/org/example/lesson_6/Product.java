package org.example.lesson_6;

public class Product {
    private String name;
    private int price;
    private boolean isAvailable;
    private ProductType type;

    public Product(String name, int price, ProductType type, boolean isAvailable) {
        this.price = price;
        this.name = name;
        this.isAvailable = isAvailable;
        this.type = type;
    }

    public ProductType getType() {
        return this.type;
    }

    public int getPrice() {
        return this.price;
    }

    public boolean getIsAvailable() {
        return this.isAvailable;
    }
}
