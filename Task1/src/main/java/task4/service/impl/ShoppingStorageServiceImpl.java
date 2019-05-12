package task4.service.impl;

import task4.dao.IDAOShopStorage;
import task4.entity.Beer;
import task4.service.ShoppingStorageService;

import java.util.ArrayList;

public class ShoppingStorageServiceImpl implements ShoppingStorageService {
    IDAOShopStorage daoShopStorage;

    public ShoppingStorageServiceImpl(IDAOShopStorage daoShopStorage) {
        this.daoShopStorage = daoShopStorage;
    }

    @Override
    public void showAllProductsFromStorage() {
        ArrayList<Beer> products = daoShopStorage.getAllProducts();
        for (Beer beer : products){
            System.out.println(beer.getId()+" - "   + beer);
        }
    }

    @Override
    public Beer getBeerByName(String name) {
        return daoShopStorage.getBeerByName(name);
    }
}
