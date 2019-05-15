package task4.dao.impl;

import task4.dao.IDAOOrder;
import task4.entity.Beer;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class DaoOrderImpl implements IDAOOrder {
    TreeMap<Date, Map> order = new TreeMap();

    public DaoOrderImpl() throws ParseException {
        Map map1 = new HashMap();
        map1.put(new Beer(1,300, "1", 30, "Ukraine"), 22);
        Map map2 = new HashMap();
        map2.put(new Beer(2,350, "2", 12, "Germany"), 1);
        Map map3 = new HashMap();
        map3.put(new Beer(3,400, "3", 21, "England"), 3);
        Map map4 = new HashMap();
        map4.put(new Beer(4,321, "4", 40, "Ukr0ne"), 267);

        order.put(new SimpleDateFormat("dd.MM.yyyy").parse("12.12.2000"), map1);
        order.put(new SimpleDateFormat("dd.MM.yyyy").parse("12.12.2005"), map2);
        order.put(new SimpleDateFormat("dd.MM.yyyy").parse("12.12.2010"), map3);
        order.put(new SimpleDateFormat("dd.MM.yyyy").parse("12.12.2018"), map4);
    }

    @Override
    public void putOrderIntoOrderMap(Date date, Map map) {
        order.put(date, map);
    }

    @Override
    public TreeMap getOrdersMap() {
        return order;
    }
}
