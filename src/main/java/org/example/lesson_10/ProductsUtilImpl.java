package org.example.lesson_10;

import java.util.ArrayList;
import java.util.List;

public class ProductsUtilImpl implements ProductsUtil {
    @Override
    public void quantityAllGoods(List<Product> products) {
        System.out.println("Общее количество продуктов " + products.size());
    }

    @Override
    public void searchByName(List<Product> products, String name) {
        boolean found = false;
        for (Product product : products) {
            if (product.getName().equals(name)) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println(name + " присутствует в списке продуктов. ");
        } else {
            System.out.println(name + " отсутствует в списке продуктов. ");
        }
    }

    @Override
    public void searchByPrice(List<Product> products, double price) {
        List<Product> resultList = new ArrayList<>();
        for (Product product : products) {
            if (product.getPrice() > price) {
                resultList.add(product);
            }
        }
        if (!resultList.isEmpty()) {
            System.out.println("Список найденных продуктов: ");
            printAllProducts(resultList);
        } else {
            System.out.println("Продуктов выше указынной ценны не найдено.");
        }
    }

    @Override
    public List<Product> addProductToListMiddle(List<Product> list, Product product) {
        list.add(list.size() / 2, product);
        return list;
    }

    @Override
    public void printAllProducts(List<Product> allList) {
        for (Product product : allList) {
            System.out.println(product.getName() + " в количестве " + product.getCount() + " по цене " + product.getPrice());
        }
    }

    @Override
    public void printAllProductsReversed(List<Product> list) {
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i).getName() + " в количестве " + list.get(i).getCount() + " по цене " + list.get(i).getPrice());
        }
    }
}

