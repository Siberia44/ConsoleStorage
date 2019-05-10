package task4.service;

import task4.entity.Beer;

public interface Cart {
    void addProductIntoCart(String name, int countOfProducts);

    void removeAllProductsFromCart();

    void showInformationAbout5LatestProductsFromCart();

    void showAllProductsInCard();
}
