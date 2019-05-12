package task4.dao;

import task4.entity.Beer;

public interface IDAOCart {

    void showAllProductsInCard();

    void addProduct(Beer beer, int countOfProducts);

    void removeAllProducts();

    void showInformationAbout5LatestProducts();

    int getTotalOrderValue();
}
