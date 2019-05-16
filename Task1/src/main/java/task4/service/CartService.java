package task4.service;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Map;

public interface CartService {
    void addProductIntoCart(String productName, int countOfProducts);

    int makeOrder(LocalDate date);

    void showInformationAbout5LatestProductsFromCart();

    void showAllProductsInCard();

    Map removeAllProductsFromCart();
}
