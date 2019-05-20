package task4.command.Impl;

import task4.command.Command;
import task4.service.CartService;
import task4.util.InputUtil;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class BuyAllProductsFromCard implements Command {
    private CartService cartService;

    public BuyAllProductsFromCard(CartService cartService) {
        this.cartService = cartService;
    }

    @Override
    public void execute() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input date (dd/MM/yyy): ");
        LocalDate localDate;
        String date = sc.nextLine();
        if (InputUtil.isDateCorrect(date)) {
            localDate = LocalDate.parse(date, formatter);
            System.out.println(cartService.makeOrder(localDate));
        } else {
            System.out.println("Data is not correct");
        }
    }

}
