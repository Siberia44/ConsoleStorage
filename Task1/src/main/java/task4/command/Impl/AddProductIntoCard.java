package task4.command.Impl;

import task4.service.CartService;
import task4.service.ShoppingStorageService;
import task4.command.Command;

import java.util.Scanner;

public class AddProductIntoCard implements Command {
    CartService cart;
    ShoppingStorageService shoppingStorage;

    public AddProductIntoCard(CartService cart, ShoppingStorageService shoppingStorage) {
        this.cart = cart;
        this.shoppingStorage = shoppingStorage;
    }

    @Override
    public void execute() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите имя товара");
        String productName = sc.next();
        System.out.println("Введите количество единиц");
        int countOfProducts = sc.nextInt();
        cart.addProductIntoCart(shoppingStorage.getBeerByName(productName), countOfProducts);
    }
}
