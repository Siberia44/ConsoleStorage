package task4.dao.impl;

import task4.dao.IDAOOrder;

import java.time.LocalDate;
import java.util.Map;
import java.util.TreeMap;

public class DaoOrderImpl implements IDAOOrder {
    private TreeMap<LocalDate, Map> order = new TreeMap();

    @Override
    public void putOrderIntoOrderMap(LocalDate date, Map map) {
        order.put(date, map);
    }

    @Override
    public TreeMap getOrdersMap() {
        return order;
    }
}
