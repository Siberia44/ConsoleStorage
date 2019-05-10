package task4.command;

import task4.service.Cart;
import task4.service.ShoppingStorage;

import java.util.Scanner;

public class AddProductIntoCard implements Command{
    Cart cart;
    ShoppingStorage shoppingStorage;

    public AddProductIntoCard(Cart cart, ShoppingStorage shoppingStorage) {
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
        if (shoppingStorage.contains(productName)) {
            cart.addProductIntoCart(productName, countOfProducts);
        }
    }
}
