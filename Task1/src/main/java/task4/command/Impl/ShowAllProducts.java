package task4.command.Impl;

import task4.service.ShoppingStorageService;
import task4.command.Command;

public class ShowAllProducts implements Command {
    ShoppingStorageService shoppingStorage;

    public ShowAllProducts(ShoppingStorageService shoppingStorage) {
        this.shoppingStorage = shoppingStorage;
    }

    @Override
    public void execute() {
        System.out.println(shoppingStorage.showAllProductsFromStorage());
    }
}
