package org.example.lesson_10;

import java.util.ArrayList;
import java.util.List;


public class App {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();

        products.add(new Product("Картофель", 1.0, 20.0));
        products.add(new Product("Морковь", 0.5, 15.0));
        products.add(new Product("Яйцо куриное", 10, 5.0));
        products.add(new Product("Огурцы маринованные", 0.7, 50.0));

        ProductsUtilImpl productsUtil = new ProductsUtilImpl();
        System.out.println(productsUtil.quantityAllGoods(products));
        System.out.println("------------------");
        System.out.println(productsUtil.searchByName(products, "Морковь"));
        System.out.println("------------------");
        System.out.println(productsUtil.searchByPrice(products, 1.0));
        System.out.println("------------------");
        productsUtil.addProductToListMiddle(products, new Product("Горошек зелёный", 1.0, 30.0));
        System.out.println(productsUtil.quantityAllGoods(products));
        System.out.println("------------------");
        System.out.println(productsUtil.searchByName(products, "Горошек зелёный"));
        System.out.println("------------------");
        productsUtil.printAllProducts(products);
        System.out.println("------------------");
        productsUtil.printAllProductsReversed(products);
    }
}
