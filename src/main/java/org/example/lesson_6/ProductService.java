package org.example.lesson_6;

public class ProductService {
    public static int getPriceForType(Product[] products, ProductType type) {
        int sum = 0;
        for (Product product : products) {
            if (product.getType().equals(type)) {
                sum = sum + product.getPrice();
            }

        }
        return sum;
    }

    public static int getAvailableProductsNumber(Product[] products, ProductType type) {
        int number = 0;
        for (Product product : products) {
            if (product.getType().equals(type)) {
                if (product.getIsAvailable()) {
                    number++;
                }
            }
        }
        return number;
    }
}
