package task4.container;

import task4.entity.Beer;

import java.util.LinkedHashMap;
import java.util.Set;

public class Cart {
    private LinkedHashMap<Beer, Integer> shoppingCart = new LinkedHashMap<>();

    public void add(Beer beer, int count) {
        if (shoppingCart.containsKey(beer)) {
            int newCount = shoppingCart.get(beer) + count;
            shoppingCart.put(beer, newCount);
        } else {
            shoppingCart.put(beer, count);
        }
    }

    public Set<Beer> keySet(){
        return shoppingCart.keySet();
    }

    public int get(Beer beer){
        return shoppingCart.get(beer);
    }

    public void clear(){
        shoppingCart.clear();
    }



    public LinkedHashMap<Beer, Integer> toHashtable() {
        return shoppingCart;
    }

}
