package task4.dao;

import task4.entity.Beer;

public interface IDAOCart {

    void showAllProductsInCard();

    void addProduct(String name, int countOfProducts);

    void removeAllProducts();

    void showInformationAbout5LatestProducts();
}
