package task4.service;

import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.Map;

public interface CartService {
    void addProductIntoCart(String productName, int countOfProducts);

    int makeOrder(LocalDate date);

    LinkedHashMap showInformationAbout5LatestProductsFromCart();

    Map showAllProductsInCard();

    Map removeAllProductsFromCart();
}
