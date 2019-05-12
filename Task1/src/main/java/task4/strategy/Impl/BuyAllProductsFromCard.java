package task4.strategy.Impl;

import task4.service.CartService;
import task4.strategy.Strategy;

public class BuyAllProductsFromCard implements Strategy {
    CartService cartService;

    public BuyAllProductsFromCard(CartService cartService) {
        this.cartService = cartService;
    }

    @Override
    public void execute() {
        System.out.println(cartService.makeOrder());
    }
}
