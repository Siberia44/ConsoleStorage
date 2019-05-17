package task4.service;

import task4.entity.Beer;

import java.util.ArrayList;

public interface ShoppingStorageService {
    ArrayList showAllProductsFromStorage();

    Beer getBeerByName(String name);
}
