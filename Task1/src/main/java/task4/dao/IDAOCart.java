package task4.dao;

import task4.entity.Beer;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public interface IDAOCart {
    /**
     * Put element into map
     *
     * @param beer            element to be appended to the map.
     *                        Key for map;
     * @param countOfProducts count of products.
     *                        Value for map;
     * @return true if the item is added
     */
    boolean addProduct(Beer beer, int countOfProducts);

    /**
     * Delete all elements from map;
     *
     * @return deleted map
     */
    HashMap<Beer, Integer> removeAllProducts();

    /**
     * Return count of products by key;
     *
     * @param beer key for map
     * @return number of values ​​by key
     */
    int getCountOfProducts(Beer beer);

    /**
     * @return shopping cart
     */
    Map getShoppingCart();

    /**
     * Get shopping cart storage.
     * Storage for all products the
     * user has purchased ever
     *
     * @return shopping cart storage
     */
    HashMap getShoppingCartStorage();

    /**
     * Set shopping cart from param;
     *
     * @param linkedHashMap storage on which we replace the storage
     */
    void updateShoppingCartStorage(LinkedHashMap linkedHashMap);

    /**
     * Put element into storage
     * with all users
     * purchases
     *
     * @param beer           element to be appended to the map.
     *                       Key for map;
     * @param countOfProduct count of products.
     *                       Value for map;
     */
    void addProductIntoShoppingCartStorage(Beer beer, int countOfProduct);

    void removeElementFromMap(Beer beer);

}
