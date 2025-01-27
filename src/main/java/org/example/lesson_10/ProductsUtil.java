package org.example.lesson_10;

import java.util.List;

public interface ProductsUtil {
    Integer quantityAllGoods(List<Product> products);

    Product searchByName(List<Product> products, String name);

    List<Product> searchByPrice(List<Product> products, double price);

    List<Product> addProductToListMiddle(List<Product> list, Product product);

    void printAllProducts(List<Product> allList);

    void printAllProductsReversed(List<Product> list);

}
