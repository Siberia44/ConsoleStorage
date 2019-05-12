package task4.dao;

import task4.entity.Beer;

import java.util.ArrayList;

public interface IDAOShopStorage {

    ArrayList getAllProducts();

    Beer getBeerByName(String name);
}
