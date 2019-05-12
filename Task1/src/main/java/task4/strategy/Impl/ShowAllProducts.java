package task4.strategy.Impl;

import task4.service.ShoppingStorageService;
import task4.strategy.Strategy;
import task4.strategy.StrategyClient;

public class ShowAllProducts extends StrategyClient implements Strategy {
    ShoppingStorageService shoppingStorage;

    public ShowAllProducts(ShoppingStorageService shoppingStorage) {
        this.shoppingStorage = shoppingStorage;
    }

    @Override
    public void execute() {
        shoppingStorage.showAllProductsFromStorage();
    }
}
