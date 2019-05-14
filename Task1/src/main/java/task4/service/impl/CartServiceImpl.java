package task4.service.impl;

import task4.dao.IDAOCart;
import task4.entity.Beer;
import task4.service.CartService;

import java.util.Map;

public class CartServiceImpl implements CartService {
    IDAOCart daoCart;

    public CartServiceImpl(IDAOCart daoCart) {
        this.daoCart = daoCart;
    }

    @Override
    public void addProductIntoCart(Beer beer, int countOfProducts) {
        int currentCount = daoCart.getCountOfProducts(beer);
        daoCart.addProduct(beer, countOfProducts + currentCount);
    }

    @Override
    public void showInformationAbout5LatestProductsFromCart() {
        daoCart.getInformationAbout5LatestProducts();
    }

    @Override
    public void showAllProductsInCard() {
        Map<Beer, Integer> products = daoCart.getAllProductsInCart();
        for (Beer key : products.keySet()) {
            System.out.println("name = " + key.getName() + ", count = " +  products.get(key));
        }
    }

    @Override
    public int makeOrder() {
        int totalOrderValue = daoCart.getTotalOrderValue();
        daoCart.removeAllProducts();
        return totalOrderValue;
    }

}
