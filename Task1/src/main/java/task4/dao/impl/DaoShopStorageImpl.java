package task4.dao.impl;

import task4.dao.IDAOShopStorage;
import task4.entity.Beer;

import java.util.*;

public class DaoShopStorageImpl implements IDAOShopStorage {
    ArrayList<Beer> shoppingStorage;

    public DaoShopStorageImpl() {
        shoppingStorage = new ArrayList();
        shoppingStorage.add(new Beer(1, 300, "1", 30, "Ukraine"));
        shoppingStorage.add( new Beer(2, 320, "2", 12, "Germany"));
        shoppingStorage.add(new Beer(3, 123, "3", 14, "England"));
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
