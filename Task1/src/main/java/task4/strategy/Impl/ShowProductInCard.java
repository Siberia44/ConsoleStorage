package task4.strategy.Impl;

import task4.service.CartService;
import task4.strategy.Strategy;
import task4.strategy.StrategyClient;

public class ShowProductInCard extends StrategyClient implements Strategy {
    CartService cart;

    public ShowProductInCard(CartService cart) {
        this.cart = cart;
    }

    @Override
    public void execute() {
        cart.showAllProductsInCard();
    }

}
