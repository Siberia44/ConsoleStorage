package task4.service.impl;

import task4.dao.IDAOCart;
import task4.service.Cart;

public class CartImpl implements Cart {
    IDAOCart daoCart;

    public CartImpl(IDAOCart daoCart) {
        this.daoCart = daoCart;
    }

    @Override
    public void addProductIntoCart(String name, int countOfProducts) {
        daoCart.addProduct(name, countOfProducts);
    }

    @Override
    public void removeAllProductsFromCart() {
        daoCart.removeAllProducts();
    }

    @Override
    public void showInformationAbout5LatestProductsFromCart() {
        daoCart.showInformationAbout5LatestProducts();
    }

    @Override
    public void showAllProductsInCard() {
        daoCart.showAllProductsInCard();
    }
}
