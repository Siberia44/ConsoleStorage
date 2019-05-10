package task4.dao.impl;

import task4.dao.IDAOShopStorage;
import task4.dao.ShoppingStorageList;

public class DaoShopStorageImpl implements IDAOShopStorage {
    ShoppingStorageList storage;

    public DaoShopStorageImpl(ShoppingStorageList storage) {
        this.storage = storage;
    }

    @Override
    public void showAllProducts() {
        for (int i = 0; i < storage.toArrayList().size(); i++) {
            System.out.print(i + "- ");
            System.out.print(storage.toArrayList().get(i));
            System.out.println();
        }
    }

    @Override
    public boolean contains(String name) {
        for (int i = 0; i < storage.toArrayList().size(); i++) {
            if (storage.toArrayList().get(i).getName().equals(name)){
                return true;
            }
        }
        return false;
    }
}
