package task4.command.Impl;

import task4.service.CartService;
import task4.command.Command;

public class BuyAllProductsFromCard implements Command {
    CartService cartService;

    public BuyAllProductsFromCard(CartService cartService) {
        this.cartService = cartService;
    }

    @Override
    public void execute() {
        System.out.println(cartService.makeOrder());
    }
}
