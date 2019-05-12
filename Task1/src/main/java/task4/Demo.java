package task4;

import task4.strategy.*;
import task4.container.Cart;
import task4.dao.IDAOCart;
import task4.dao.IDAOShopStorage;
import task4.container.StoreStorage;
import task4.dao.impl.DaoCartImpl;
import task4.dao.impl.DaoShopStorageImpl;
import task4.service.CartService;
import task4.service.ShoppingStorageService;
import task4.service.impl.CartServiceImpl;
import task4.service.impl.ShoppingStorageServiceImpl;
import task4.strategy.Impl.AddProductIntoCard;
import task4.strategy.Impl.BuyAllProductsFromCard;
import task4.strategy.Impl.ShowAllProducts;
import task4.strategy.Impl.ShowProductInCard;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        StoreStorage shoppingStorageList = new StoreStorage();
        Cart cartHashTable = new Cart();

        IDAOShopStorage daoShopStorage = new DaoShopStorageImpl(shoppingStorageList);
        IDAOCart daoCart = new DaoCartImpl(cartHashTable);

        ShoppingStorageService shoppingStorage = new ShoppingStorageServiceImpl(daoShopStorage);
        CartService cart = new CartServiceImpl(daoCart);

        StrategyClient strategyClient = new StrategyClient();

        Map<String, Strategy> map = new HashMap<>();
        map.put("1", new ShowAllProducts(shoppingStorage));
        map.put("2", new ShowProductInCard(cart));
        map.put("3", new AddProductIntoCard(cart, shoppingStorage));
        map.put("4", new BuyAllProductsFromCard(cart));

        Scanner sc = new Scanner(System.in);
        while (true){
            String number = sc.next();
            strategyClient.setStrategy(map.get(number));
            strategyClient.executeStrategy();
        }
    }

}
