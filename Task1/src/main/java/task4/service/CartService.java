package task4.service;

import task4.entity.Beer;

public interface CartService {
    void addProductIntoCart(Beer beer, int countOfProducts);

    int makeOrder();

    void showInformationAbout5LatestProductsFromCart();

    void showAllProductsInCard();
}
