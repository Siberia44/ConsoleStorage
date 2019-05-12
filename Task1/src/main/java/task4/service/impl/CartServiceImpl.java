package task4.service.impl;

import task4.dao.IDAOCart;
import task4.entity.Beer;
import task4.service.CartService;

public class CartServiceImpl implements CartService {
    IDAOCart daoCart;

    public CartServiceImpl(IDAOCart daoCart) {
        this.daoCart = daoCart;
    }

    @Override
    public void addProductIntoCart(Beer beer, int countOfProducts) {
        daoCart.addProduct(beer, countOfProducts);
    }

    @Override
    public void showInformationAbout5LatestProductsFromCart() {
        daoCart.showInformationAbout5LatestProducts();
    }

    @Override
    public void showAllProductsInCard() {
        daoCart.showAllProductsInCard();
    }

    @Override
    public int makeOrder() {
        int totalOrderValue = daoCart.getTotalOrderValue();
        daoCart.removeAllProducts();
        return totalOrderValue;
    }


}
