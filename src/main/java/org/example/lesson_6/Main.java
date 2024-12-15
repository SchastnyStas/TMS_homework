package org.example.lesson_6;

import static org.example.lesson_6.ProductService.getAvailableProductsNumber;
import static org.example.lesson_6.ProductService.getPriceForType;

public class Main {
    public static void main(String[] args) {
        Product[] products = new Product[8];
        products[0] = new Product("Nokia", 100, ProductType.MOBILE, true);
        products[1] = new Product("Sony", 50, ProductType.AUDIO, false);
        products[2] = new Product("Toshiba", 999, ProductType.TV, true);
        products[3] = new Product("Iphone", 525, ProductType.MOBILE, true);
        products[4] = new Product("Marshall", 215, ProductType.AUDIO, true);
        products[5] = new Product("Gorizont", 770, ProductType.TV, false);
        products[6] = new Product("Samsung", 33, ProductType.MOBILE, false);
        products[7] = new Product("Xiaomi", 869, ProductType.TV, true);

        System.out.println(getPriceForType(products, ProductType.AUDIO));
        System.out.println(getAvailableProductsNumber(products, ProductType.TV));
    }
}
