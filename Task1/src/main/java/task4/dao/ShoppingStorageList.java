package task4.dao;

import task4.entity.Beer;

import java.util.ArrayList;
import java.util.List;

public class ShoppingStorageList {
    ArrayList<Beer> shoppingStorage = new ArrayList();
    Beer beer1 = new Beer(1, 300, "Radler", 30, "Ukraine");
    Beer beer2 = new Beer(2, 320, "Hoegarden", 12, "Germany");
    Beer beer3 = new Beer(3, 123, "Leffe", 14, "England");

    public ShoppingStorageList() {
        shoppingStorage.add(beer1);
        shoppingStorage.add(beer2);
        shoppingStorage.add(beer3);
    }

    public List<Beer> toArrayList(){
        return shoppingStorage;
    }

}
