package task4.dao;

import java.time.LocalDate;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public interface IDAOOrder {
    void putOrderIntoOrderMap(LocalDate date, Map map);

    TreeMap getOrdersMap();
}
