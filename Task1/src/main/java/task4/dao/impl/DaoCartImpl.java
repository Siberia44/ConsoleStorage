package task4.dao.impl;

import task4.container.Cart;
import task4.dao.IDAOCart;
import task4.entity.Beer;

public class DaoCartImpl implements IDAOCart {
    Cart shoppingCart;

    public DaoCartImpl(Cart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    @Override
    public void addProduct(Beer beer, int countOfProducts) {
        shoppingCart.add(beer, countOfProducts);
    }

    @Override
    public void removeAllProducts() {
        shoppingCart.clear();
    }

    @Override
    public void showInformationAbout5LatestProducts() {
    }

    @Override
    public void showAllProductsInCard() {
        for (Beer key : shoppingCart.keySet()) {
            System.out.println("name = " + key.getName() + ", count = " +  shoppingCart.get(key));
        }
    }

    @Override
    public int getTotalOrderValue() {
        int totalCost = 0;
        for (Beer key : shoppingCart.keySet()){
            totalCost += key.getCost() * shoppingCart.get(key);
        }
        return totalCost;
    }
}
