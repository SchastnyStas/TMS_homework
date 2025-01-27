package org.example.lesson_10;

import java.util.ArrayList;
import java.util.List;

public class ProductsUtilImpl implements ProductsUtil {
    @Override
    public Integer quantityAllGoods(List<Product> products) {
       return products.size();
    }

    @Override
    public Product searchByName(List<Product> products, String name) {
        for (Product product : products) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        return null;
    }

    @Override
    public List<Product> searchByPrice(List<Product> products, double price) {
        List<Product> resultList = new ArrayList<>();
        for (Product product : products) {
            if (product.getPrice() > price) {
                resultList.add(product);
            }
        }
        return resultList;
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

