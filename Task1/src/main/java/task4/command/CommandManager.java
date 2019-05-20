package task4.command;

import task4.command.Impl.*;
import task4.dao.IDAOCart;
import task4.dao.IDAOOrder;
import task4.dao.IDAOShopStorage;
import task4.dao.impl.DaoCartImpl;
import task4.dao.impl.DaoOrderImpl;
import task4.dao.impl.DaoShopStorageImpl;
import task4.entity.Beer;
import task4.service.CartService;
import task4.service.OrderService;
import task4.service.ShoppingStorageService;
import task4.service.impl.CartServiceImpl;
import task4.service.impl.OrderServiceImpl;
import task4.service.impl.ShoppingStorageServiceImpl;
import task4.storage.FillingStorage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CommandManager {
    private ArrayList<Beer> initProducts = new FillingStorage().setArrayListByTestData();

    private IDAOShopStorage daoShopStorage = new DaoShopStorageImpl(initProducts);
    private IDAOCart daoCart = new DaoCartImpl();
    private IDAOOrder daoOrder = new DaoOrderImpl();

    private ShoppingStorageService shoppingStorage = new ShoppingStorageServiceImpl(daoShopStorage);
    private OrderService order = new OrderServiceImpl(daoOrder);
    private CartService cart = new CartServiceImpl(daoCart, shoppingStorage, order);

    CommandClient commandClient = new CommandClient();

    Map<String, Command> map = new HashMap<>();

    public CommandManager() {
        map.put("1", new ShowAllProducts(shoppingStorage));
        map.put("2", new ShowProductInCard(cart));
        map.put("3", new AddProductIntoCard(cart));
        map.put("4", new BuyAllProductsFromCard(cart));
        map.put("5", new ShowLast5Products(cart));
        map.put("6", new GetNearestDate(order));
        map.put("7", new GetOrdersInGap(order));
    }

    public void showMenu() {
        System.out.println("1. Show all products");
        System.out.println("2. Show products in cart");
        System.out.println("3. Add product in card");
        System.out.println("4. Buy all products from cart");
        System.out.println("5. Show 5 latest products");
        System.out.println("6. Show order by nearest date");
        System.out.println("7. Show order list in gap");
        Scanner sc = new Scanner(System.in);
        while (true) {
            String number = sc.nextLine();
            if (map.containsKey(number)) {
                commandClient.setCommand(map.get(number));
                commandClient.executeCommand();
            } else {
                System.out.println("Wrong command");
            }
        }
    }

}
