package task4.dao.impl;

import task4.dao.IDAOCart;
import task4.entity.Beer;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class DaoCartImpl implements IDAOCart {
    private HashMap<Beer, Integer> shoppingCart;
    private LinkedHashMap<Beer, Integer> shoppingCartStorage;

    public DaoCartImpl() {
        shoppingCart = new HashMap<>();
    }

    @Override
    public void addProduct(Beer beer, int countOfProducts) {
        shoppingCart.put(beer, countOfProducts);
       // shoppingCartStorage.put(beer, countOfProducts);
    }

    @Override
    public void removeAllProducts() {
        shoppingCart.clear();
    }

    @Override
    public Map getInformationAbout5LatestProducts() {
       return null; //TO DO
    }

    @Override
    public Map getAllProductsInCart() {
        return shoppingCart;
    }

    @Override
    public int getTotalOrderValue() {
        int totalCost = 0;
        for (Beer key : shoppingCart.keySet()){
            totalCost += key.getCost() * shoppingCart.get(key);
        }
        return totalCost;
    }

    @Override
    public int getCountOfProducts(Beer beer) {
        return shoppingCart.get(beer);
    }
}
