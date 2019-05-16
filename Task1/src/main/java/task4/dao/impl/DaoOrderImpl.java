package task4.dao.impl;

import task4.dao.IDAOOrder;
import task4.entity.Beer;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class DaoOrderImpl implements IDAOOrder {
    TreeMap<LocalDate, Map> order = new TreeMap();

    public DaoOrderImpl(){
        Map map1 = new HashMap();
        map1.put(new Beer(1,300, "1", 30, "Ukraine"), 22);
        Map map2 = new HashMap();
        map2.put(new Beer(2,350, "2", 12, "Germany"), 1);
        Map map3 = new HashMap();
        map3.put(new Beer(3,400, "3", 21, "England"), 3);
        Map map4 = new HashMap();
        map4.put(new Beer(4,321, "4", 40, "Ukr0ne"), 267);
        Map map5 = new HashMap();
        map5.put(new Beer(5,21, "5", 4, "Ukr0ne"), 4);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        order.put(LocalDate.parse("12.12.2000", formatter), map1);
        order.put(LocalDate.parse("12.12.2005", formatter), map2);
        order.put(LocalDate.parse("12.12.2015", formatter), map3);
        order.put(LocalDate.parse("12.12.2018", formatter), map4);
        order.put(LocalDate.parse("12.12.2013", formatter), map5);
    }

    @Override
    public void putOrderIntoOrderMap(LocalDate date, Map map) {
        order.put(date, map);
    }

    @Override
    public TreeMap getOrdersMap() {
        return order;
    }
}
