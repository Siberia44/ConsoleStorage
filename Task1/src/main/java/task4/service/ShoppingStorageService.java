package task4.service;

import task4.entity.Beer;

public interface ShoppingStorageService {
    void showAllProductsFromStorage();

    Beer getBeerByName(String name);
}
