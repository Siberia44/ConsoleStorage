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
        return true;
    }

    @Override
    public HashMap removeAllProducts() {
        HashMap deletedCart = new HashMap(shoppingCart);
        shoppingCart.clear();
        return deletedCart;
    }

    @Override
    public LinkedHashMap getShoppingCartStorage() {
        return shoppingCartStorage;
    }

    @Override
    public void updateShoppingCartStorage(LinkedHashMap linkedHashMap) {
        this.shoppingCartStorage = linkedHashMap;
    }

    @Override
    public void addProductIntoShoppingCartStorage(Beer beer, int countOfProduct) {
        shoppingCartStorage.put(beer, countOfProduct);
    }

    @Override
    public Map getShoppingCart(){
        return shoppingCart;
    }

    @Override
    public int getCountOfProducts(Beer beer) {
        return shoppingCart.getOrDefault(beer, 0);
    }

}
