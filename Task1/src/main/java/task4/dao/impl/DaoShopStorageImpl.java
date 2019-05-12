package task4.dao.impl;

import task4.dao.IDAOShopStorage;
import task4.container.StoreStorage;
import task4.entity.Beer;

import java.util.ArrayList;

public class DaoShopStorageImpl implements IDAOShopStorage {
    StoreStorage storage;

    public DaoShopStorageImpl(StoreStorage storage) {
        this.storage = storage;
    }

    @Override
    public ArrayList<Beer> getAllProducts() {
        return storage.toArrayList();
    }

    @Override
    public Beer getBeerByName(String name) {
        for (int i = 0; i < storage.size(); i++) {
            if (storage.get(i).getName().equals(name)){
                return storage.get(i);
            }
        }
        return null;
    }
}
