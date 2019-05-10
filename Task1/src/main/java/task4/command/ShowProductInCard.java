package task4.command;

import task4.service.Cart;

public class ShowProductInCard implements Command {
    Cart cart;

    public ShowProductInCard(Cart cart) {
        this.cart = cart;
    }

    @Override
    public void execute() {
        cart.showAllProductsInCard();
    }

}
