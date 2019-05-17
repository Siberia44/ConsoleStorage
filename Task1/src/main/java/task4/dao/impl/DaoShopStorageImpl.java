package task4.dao.impl;

import task4.dao.IDAOShopStorage;
import task4.entity.Beer;

import java.util.*;

public class DaoShopStorageImpl implements IDAOShopStorage {
    ArrayList<Beer> shoppingStorage;

    public DaoShopStorageImpl(ArrayList<Beer> shoppingStorage) {
        this.shoppingStorage = shoppingStorage;
    }

    @Override
    public ArrayList<Beer> getAllProducts() {
        return shoppingStorage;
    }

    @Override
    public Beer getBeerByName(String name) {
        Optional<Beer> o1 = shoppingStorage.stream()
                .filter(c->c.getName().equals(name))
                .findFirst();
        return o1.orElse(null);
    }
}
