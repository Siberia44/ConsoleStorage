package task4.command.Impl;

import task4.service.CartService;
import task4.command.Command;

public class ShowProductInCard implements Command {
    CartService cart;

    public ShowProductInCard(CartService cart) {
        this.cart = cart;
    }

    @Override
    public void execute() {
        System.out.println(cart.showAllProductsInCard());
    }

}
