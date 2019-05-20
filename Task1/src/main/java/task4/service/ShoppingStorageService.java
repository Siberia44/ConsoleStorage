package task4.service;

import task4.entity.Beer;

import java.util.List;

public interface ShoppingStorageService {
    /**
     * get all products which contains in the shop
     *
     * @return list of products
     */
    List showAllProductsFromStorage();

    /**
     * get product by name
     *
     * @param name name of product
     * @return product
     */
    Beer getBeerByName(String name);
}
