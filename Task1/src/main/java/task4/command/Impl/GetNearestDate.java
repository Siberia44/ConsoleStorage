package task4.command.Impl;

import task4.command.Command;
import task4.service.OrderService;

import java.util.Scanner;

public class GetNearestDate implements Command {
    OrderService orderService;

    public GetNearestDate(OrderService orderService) {
        this.orderService = orderService;
    }

    @Override
    public void execute() {
        System.out.println("Input nearest date");
        Scanner scanner = new Scanner(System.in);
        String date = scanner.nextLine();
        System.out.println(orderService.getNearestOrder(date));
    }
}
