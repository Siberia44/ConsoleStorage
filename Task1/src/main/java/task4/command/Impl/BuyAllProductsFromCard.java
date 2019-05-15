package task4.command.Impl;

import task4.service.CartService;
import task4.command.Command;
import task4.service.OrderService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Scanner;

public class BuyAllProductsFromCard implements Command {
    CartService cartService;

    public BuyAllProductsFromCard(CartService cartService) {
        this.cartService = cartService;
    }

    @Override
    public void execute() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input date (dd.MM.yyy): ");
        Date date1 = null;
        String date = sc.nextLine();
        try {
            date1 = simpleDateFormat.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(cartService.makeOrder(date1));
    }

}
