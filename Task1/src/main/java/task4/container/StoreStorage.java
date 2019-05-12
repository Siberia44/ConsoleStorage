package task4.container;

import task4.entity.Beer;

import java.util.ArrayList;
import java.util.List;

public class StoreStorage {
    ArrayList<Beer> shoppingStorage = new ArrayList();
    private Beer radler;
    private Beer hoegarden;
    private Beer leffe;

    public StoreStorage() {
        initProductsInShop();
        shoppingStorage.add(radler);
        shoppingStorage.add(hoegarden);
        shoppingStorage.add(leffe);
    }

    private void initProductsInShop(){
        radler = new Beer(1, 300, "Radler", 30, "Ukraine");
        hoegarden = new Beer(2, 320, "Hoegarden", 12, "Germany");
        leffe = new Beer(3, 123, "Leffe", 14, "England");
    }

    public ArrayList<Beer> toArrayList(){
        return shoppingStorage;
    }

    public int size(){
        return shoppingStorage.size();
    }

    public Beer get(int i){
        return shoppingStorage.get(i);
    }

}
