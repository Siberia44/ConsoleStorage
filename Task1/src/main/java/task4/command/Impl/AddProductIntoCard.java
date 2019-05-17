package task4.command.Impl;

import task4.service.CartService;
import task4.service.ShoppingStorageService;
import task4.command.Command;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class AddProductIntoCard implements Command {
    CartService cart;

    public AddProductIntoCard(CartService cart) {
        this.cart = cart;
    }

    @Override
    public void execute() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите имя товара");
        String productName = sc.next();
        System.out.println("Введите количество единиц");
        int countOfProducts = sc.nextInt();
        try {
            cart.addProductIntoCart(productName, countOfProducts);
        } catch (IllegalArgumentException | NoSuchElementException e){
            System.out.println(e.getMessage());
        }
    }
}
