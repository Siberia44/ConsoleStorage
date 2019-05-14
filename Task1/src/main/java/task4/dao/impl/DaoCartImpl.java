package task4.dao.impl;

import task4.dao.IDAOCart;
import task4.entity.Beer;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class DaoCartImpl implements IDAOCart {
    private HashMap<Beer, Integer> shoppingCart;
    private LinkedHashMap<Beer, Integer> shoppingCartStorage;

    public DaoCartImpl() {
        shoppingCart = new HashMap<>();
        shoppingCartStorage = new LinkedHashMap<>();
    }

    @Override
    public void addProduct(Beer beer, int countOfProducts) {
        shoppingCart.put(beer, countOfProducts);
        shoppingCartStorage.put(beer, countOfProducts);
    }

    @Override
    public void removeAllProducts() {
        shoppingCart.clear();
    }

    @Override
    public Map getInformationAbout5LatestProducts() {
       return shoppingCartStorage.entrySet().stream().limit(5)
               .collect(Collectors.toMap(p -> p.getKey(), p -> p.getValue()));
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
        return shoppingCart.containsValue(beer) ? shoppingCart.get(beer) : -1;
    }
}
