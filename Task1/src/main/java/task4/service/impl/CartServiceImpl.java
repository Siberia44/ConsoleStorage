package task4.service.impl;

import task4.dao.IDAOCart;
import task4.entity.Beer;
import task4.service.CartService;
import task4.service.OrderService;
import task4.service.ShoppingStorageService;

import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

public class CartServiceImpl implements CartService {
    IDAOCart daoCart;
    ShoppingStorageService shoppingStorageService;
    OrderService order;

    public CartServiceImpl(IDAOCart daoCart, ShoppingStorageService shoppingStorageService, OrderService order) {
        this.daoCart = daoCart;
        this.shoppingStorageService = shoppingStorageService;
        this.order = order;
    }

    @Override
    public void addProductIntoCart(String name, int countOfProducts) {
        if (!checkIndex(countOfProducts)){
            System.out.println("Invalid number value");
            return;
        }
        Beer beer = shoppingStorageService.getBeerByName(name);
        if (Objects.nonNull(beer)) {
            daoCart.addProduct(beer, daoCart.getCountOfProducts(beer) + countOfProducts);
        } else {
            System.out.println("Product not fount in shop");
        }
    }

    private boolean checkIndex(int countOfProducts){
        if (countOfProducts <= 0){
            return false;
        }
        return true;
    }

    @Override
    public void showInformationAbout5LatestProductsFromCart() {
        LinkedHashMap shoppingCartStorage = daoCart.getInformationAbout5LatestProducts();
        System.out.println(shoppingCartStorage);
    }

    @Override
    public void showAllProductsInCard() {
        Map<Beer, Integer> products = daoCart.getAllProductsInCart();
        for (Beer key : products.keySet()) {
            System.out.println("name = " + key.getName() + ", count = " + products.get(key));
        }
    }

    @Override
    public int makeOrder(Date date) {
        int totalOrderValue = daoCart.getTotalOrderValue();
        order.putInfoAboutOrderIntoMap(date, removeAllProductsFromCart());
        return totalOrderValue;
    }

    @Override
    public Map removeAllProductsFromCart() {
        return daoCart.removeAllProducts();
    }
}
