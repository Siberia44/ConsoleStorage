package task4.dao;

import task4.entity.Beer;

import java.util.Map;

public interface IDAOCart {

    Map getAllProductsInCart();

    void addProduct(Beer beer, int countOfProducts);

    void removeAllProducts();

    Map<Beer, Integer> getInformationAbout5LatestProducts();

    int getTotalOrderValue();

    int getCountOfProducts(Beer beer);

}
