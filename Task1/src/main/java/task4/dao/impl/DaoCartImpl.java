package task4.dao.impl;

import task4.dao.CartHashTable;
import task4.dao.IDAOCart;

public class DaoCartImpl implements IDAOCart {
    CartHashTable shoppingCart;

    public DaoCartImpl(CartHashTable shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    @Override
    public void addProduct(String name, int countOfProducts) {
        shoppingCart.add(name, countOfProducts);
    }

    @Override
    public void removeAllProducts() {
        shoppingCart.toHashtable().clear();
    }

    @Override
    public void showInformationAbout5LatestProducts() {
    }

    @Override
    public void showAllProductsInCard() {
        for (Object key : shoppingCart.toHashtable().keySet()) {
            System.out.println("name = " + key + ", count = " +  shoppingCart.toHashtable().get(key));
        }
    }
}
