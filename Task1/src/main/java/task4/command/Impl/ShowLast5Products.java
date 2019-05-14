package task4.command.Impl;

import task4.command.Command;
import task4.service.CartService;
import task4.service.impl.CartServiceImpl;

public class ShowLast5Products implements Command {
    CartService cartService;

    public ShowLast5Products(CartService cartService) {
        this.cartService = cartService;
    }

    @Override
    public void execute() {
        cartService.showInformationAbout5LatestProductsFromCart();
    }
}
