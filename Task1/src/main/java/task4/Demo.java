package task4;

import task4.command.AddProductIntoCard;
import task4.command.Realisator;
import task4.command.ShowAllProducts;
import task4.command.ShowProductInCard;
import task4.dao.CartHashTable;
import task4.dao.IDAOCart;
import task4.dao.IDAOShopStorage;
import task4.dao.ShoppingStorageList;
import task4.dao.impl.DaoCartImpl;
import task4.dao.impl.DaoShopStorageImpl;
import task4.service.Cart;
import task4.service.ShoppingStorage;
import task4.service.impl.CartImpl;
import task4.service.impl.ShoppingStorageImpl;

public class Demo {
    public static void main(String[] args) {
        ShoppingStorageList shoppingStorageList = new ShoppingStorageList();
        CartHashTable cartHashTable = new CartHashTable();

        IDAOShopStorage daoShopStorage = new DaoShopStorageImpl(shoppingStorageList);
        IDAOCart daoCart = new DaoCartImpl(cartHashTable);

        ShoppingStorage shoppingStorage = new ShoppingStorageImpl(daoShopStorage);
        Cart cart = new CartImpl(daoCart);

        Realisator realisator = new Realisator.RealisatorBuilder()
                .setAddProductIntoCard(new AddProductIntoCard(cart, shoppingStorage))
                .setShowAllProducts(new ShowAllProducts(shoppingStorage))
                .setShowProductsInCard(new ShowProductInCard(cart))
                .build();

        realisator.showAllProducts();
        realisator.addProduct();
        realisator.showProductsInCard();
        realisator.addProduct();
        realisator.showProductsInCard();
    }
}
