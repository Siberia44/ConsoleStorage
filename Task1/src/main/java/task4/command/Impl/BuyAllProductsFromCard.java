package task4.command.Impl;

import task4.command.Command;
import task4.service.CartService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class BuyAllProductsFromCard implements Command {
    CartService cartService;

    public BuyAllProductsFromCard(CartService cartService) {
        this.cartService = cartService;
    }

    @Override
    public void execute() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input date (dd.MM.yyy): ");
        LocalDate localDate;
        String date = sc.nextLine();
        localDate = LocalDate.parse(date, formatter);
        System.out.println(cartService.makeOrder(localDate));
    }

}
