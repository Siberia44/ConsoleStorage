package task4.dao;

import java.util.Hashtable;
import java.util.Objects;

public class CartHashTable {
    private Hashtable<String, Integer> shoppingCart = new Hashtable<>();

    public void add(String name, int count){
        if (shoppingCart.containsKey(name)){
            int newCount = shoppingCart.get(name) + count;
            shoppingCart.put(name, newCount);
        } else {
            shoppingCart.put(name, count);
        }
    }

    public Hashtable toHashtable(){
        return shoppingCart;
    }

}
