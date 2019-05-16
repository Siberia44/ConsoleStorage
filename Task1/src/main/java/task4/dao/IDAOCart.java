package task4.dao;

import task4.entity.Beer;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public interface IDAOCart {

    Map getAllProductsInCart();

    boolean addProduct(Beer beer, int countOfProducts);

    HashMap removeAllProducts();

    void addIntoMapFor5LastProducts(Beer beer, int countOfProducts);

    LinkedHashMap getInformationAbout5LatestProducts();

    int getTotalOrderValue();

    int getCountOfProducts(Beer beer);

}
