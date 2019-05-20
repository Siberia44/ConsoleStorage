package task4.dao;

import java.time.LocalDate;
import java.util.Map;
import java.util.TreeMap;

public interface IDAOOrder {

    /**
     * Put order into orders map
     *
     * @param date Date of purchase
     * @param map  product basket ordered
     */
    void putOrderIntoOrderMap(LocalDate date, Map map);

    /**
     * Get order storage;
     *
     * @return order storage
     */
    TreeMap getOrdersMap();
}
