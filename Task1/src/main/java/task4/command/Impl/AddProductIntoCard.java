package task4.command.Impl;

import task4.command.Command;
import task4.service.CartService;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class AddProductIntoCard implements Command {
    private CartService cart;

    public AddProductIntoCard(CartService cart) {
        this.cart = cart;
    }

    @Override
    public void execute() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter product name");
        String productName = sc.next();
        System.out.println("Enter quantity");
        int countOfProducts = sc.nextInt();
        try {
            cart.addProductIntoCart(productName, countOfProducts);
        } catch (IllegalArgumentException | NoSuchElementException e) {
            System.out.println(e.getMessage());
        }
    }
}
