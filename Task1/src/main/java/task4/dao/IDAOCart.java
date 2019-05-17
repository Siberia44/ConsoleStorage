package task4.dao;

import task4.entity.Beer;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public interface IDAOCart {

    boolean addProduct(Beer beer, int countOfProducts);

    HashMap removeAllProducts();

    int getCountOfProducts(Beer beer);

    Map getShoppingCart();

    LinkedHashMap getShoppingCartStorage();

    void updateShoppingCartStorage(LinkedHashMap linkedHashMap);

    void addProductIntoShoppingCartStorage(Beer beer, int countOfProduct);

}
