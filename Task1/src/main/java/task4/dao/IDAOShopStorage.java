package task4.dao;

import task4.entity.Beer;

import java.util.ArrayList;

public interface IDAOShopStorage {

    /**
     * Get product list
     *
     * @return list with all products in shop
     */
    ArrayList getAllProducts();

    /**
     * Get product by name
     *
     * @param name name of product
     * @return product
     */
    Beer getBeerByName(String name);
}
