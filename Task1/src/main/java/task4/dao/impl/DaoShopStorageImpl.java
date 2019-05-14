package task4.dao.impl;

import task4.dao.IDAOShopStorage;
import task4.entity.Beer;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class DaoShopStorageImpl implements IDAOShopStorage {
    ArrayList<Beer> shoppingStorage;

    public DaoShopStorageImpl() {
        shoppingStorage = new ArrayList();
        Beer radler =  new Beer(1, 300, "Radler", 30, "Ukraine");
        Beer hoegarden = new Beer(2, 320, "Hoegarden", 12, "Germany");
        Beer leffe = new Beer(3, 123, "Leffe", 14, "England");
        shoppingStorage.add(radler);
        shoppingStorage.add(hoegarden);
        shoppingStorage.add(leffe);
    }

    @Override
    public ArrayList<Beer> getAllProducts() {
        return shoppingStorage;
    }

    @Override
    public Beer getBeerByName(String name) {
        for (int i = 0; i < shoppingStorage.size(); i++) {
            if (shoppingStorage.get(i).getName().equals(name)) {
                return shoppingStorage.get(i);
            }
        }
        throw new NoSuchElementException();
    }
}
