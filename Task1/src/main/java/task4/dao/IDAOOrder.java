package task4.dao;

import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public interface IDAOOrder {
    void putOrderIntoOrderMap(Date date, Map map);

    TreeMap getOrdersMap();
}
