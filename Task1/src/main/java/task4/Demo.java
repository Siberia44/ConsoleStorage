package task4;

import task4.command.Impl.*;
import task4.dao.IDAOCart;
import task4.dao.IDAOShopStorage;
import task4.dao.impl.DaoCartImpl;
import task4.dao.impl.DaoShopStorageImpl;
import task4.service.CartService;
import task4.service.ShoppingStorageService;
import task4.service.impl.CartServiceImpl;
import task4.service.impl.ShoppingStorageServiceImpl;
import task4.command.Command;
import task4.command.CommandClient;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        IDAOShopStorage daoShopStorage = new DaoShopStorageImpl();
        IDAOCart daoCart = new DaoCartImpl();

        ShoppingStorageService shoppingStorage = new ShoppingStorageServiceImpl(daoShopStorage);
        CartService cart = new CartServiceImpl(daoCart);

        CommandClient commandClient = new CommandClient();

        Map<String, Command> map = new HashMap<>();
        map.put("1", new ShowAllProducts(shoppingStorage));
        map.put("2", new ShowProductInCard(cart));
        map.put("3", new AddProductIntoCard(cart, shoppingStorage));
        map.put("4", new BuyAllProductsFromCard(cart));
        map.put("5", new ShowLast5Products(cart));

        Scanner sc = new Scanner(System.in);
        while (true){
            String number = sc.next();
            commandClient.setCommand(map.get(number));
            commandClient.executeCommand();
        }
    }

}
