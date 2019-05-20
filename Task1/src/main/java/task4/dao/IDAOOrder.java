package task4.dao;

import java.time.LocalDate;
import java.util.Map;

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
    Map getOrdersMap();
}
