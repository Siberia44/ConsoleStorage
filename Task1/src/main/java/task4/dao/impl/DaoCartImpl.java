package task4.dao.impl;

import task4.dao.IDAOCart;
import task4.entity.Beer;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class DaoCartImpl implements IDAOCart {
    private HashMap<Beer, Integer> shoppingCart;
    private HashMap<Beer, Integer> shoppingCartStorage = new LinkedHashMap<Beer, Integer>(){
        @Override
        protected boolean removeEldestEntry(Map.Entry<Beer, Integer> eldest) {
            return size() > 5;
        }
    };

    public DaoCartImpl() {
        shoppingCart = new HashMap<>();
    }

    @Override
    public boolean addProduct(Beer beer, int countOfProducts) {
        shoppingCart.put(beer, countOfProducts);
        return true;
    }

    @Override
    public Map<Beer, Integer> removeAllProducts() {
        HashMap<Beer, Integer> deletedCart = new HashMap<>(shoppingCart);
        shoppingCart.clear();
        return deletedCart;
    }

    @Override
    public Map getShoppingCartStorage() {
        return shoppingCartStorage;
    }

    @Override
    public void updateShoppingCartStorage(Map linkedHashMap) {
        this.shoppingCartStorage = (HashMap<Beer, Integer>) linkedHashMap;
    }

    @Override
    public void addProductIntoShoppingCartStorage(Beer beer, int countOfProduct) {
        shoppingCartStorage.put(beer, countOfProduct);
    }

    @Override
    public Map getShoppingCart() {
        return shoppingCart;
    }

    @Override
    public int getCountOfProducts(Beer beer) {
        return shoppingCart.getOrDefault(beer, 0);
    }

    @Override
    public void removeElementFromMap(Beer beer) {
        shoppingCartStorage.remove(beer);
    }
}
