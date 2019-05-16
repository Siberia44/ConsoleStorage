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
        shoppingCartStorage = new LinkedHashMap<>();
    }

    @Override
    public boolean addProduct(Beer beer, int countOfProducts) {
        shoppingCart.put(beer, countOfProducts);
        addIntoMapFor5LastProducts(beer, countOfProducts);
        return true;
    }

    @Override
    public LinkedHashMap getInformationAbout5LatestProducts() {
        return shoppingCartStorage;
    }

    @Override
    public HashMap removeAllProducts() {
        HashMap deletedCart = new HashMap(shoppingCart);
        shoppingCart.clear();
        return deletedCart;
    }

    @Override
    public void addIntoMapFor5LastProducts(Beer beer, int countOfProduct) {
        shoppingCartStorage.put(beer, countOfProduct);
        shoppingCartStorage.keySet().removeIf(o -> shoppingCartStorage.size() == 6);
    }

    @Override
    public Map getAllProductsInCart() {
        return shoppingCart;
    }

    @Override
    public int getTotalOrderValue() {
        int totalCost = 0;
        for (Beer key : shoppingCart.keySet()) {
            totalCost += key.getCost() * shoppingCart.get(key);
        }
        return totalCost;
    }

    @Override
    public int getCountOfProducts(Beer beer) {
        return shoppingCart.getOrDefault(beer, 0);
    }
}
