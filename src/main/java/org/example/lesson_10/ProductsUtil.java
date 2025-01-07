package org.example.lesson_10;

import java.util.List;

public interface ProductsUtil {
    void quantityAllGoods(List<Product> products);

    void searchByName(List<Product> products, String name);

    void searchByPrice(List<Product> products, double price);

    List<Product> addProductToListMiddle(List<Product> list, Product product);

    void printAllProducts(List<Product> allList);

    void printAllProductsReversed(List<Product> list);

}
