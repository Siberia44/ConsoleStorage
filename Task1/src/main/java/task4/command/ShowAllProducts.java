package task4.command;

import task4.service.ShoppingStorage;

public class ShowAllProducts implements Command{
    ShoppingStorage shoppingStorage;

    public ShowAllProducts(ShoppingStorage shoppingStorage) {
        this.shoppingStorage = shoppingStorage;
    }

    @Override
    public void execute() {
        shoppingStorage.showAllProductsFromStorage();
    }
}
