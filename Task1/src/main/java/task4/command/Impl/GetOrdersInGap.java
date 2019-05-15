package task4.command.Impl;

import task4.command.Command;
import task4.service.OrderService;

import java.util.Scanner;

public class GetOrdersInGap implements Command {
    OrderService orderService;

    public GetOrdersInGap(OrderService orderService) {
        this.orderService = orderService;
    }

    @Override
    public void execute() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input first date");
        String firstDate = sc.nextLine();
        System.out.println("Input last date");
        String lastDate = sc.nextLine();
        System.out.println(orderService.getOrdersInGap(firstDate, lastDate));
    }
}
