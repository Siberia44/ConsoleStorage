package task4.service.impl;

import task4.dao.IDAOShopStorage;
import task4.service.ShoppingStorage;

public class ShoppingStorageImpl implements ShoppingStorage {
    IDAOShopStorage daoShopStorage;

    public ShoppingStorageImpl(IDAOShopStorage daoShopStorage) {
        this.daoShopStorage = daoShopStorage;
    }

    @Override
    public void showAllProductsFromStorage() {
        daoShopStorage.showAllProducts();
    }

    @Override
    public boolean contains(String name) {
        return daoShopStorage.contains(name);
    }
}
