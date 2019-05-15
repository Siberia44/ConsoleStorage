package task4.service;

import java.util.Date;
import java.util.Map;

public interface OrderService {
    void putInfoAboutOrderIntoMap(Date date, Map map);

    Map getNearestOrder(String date);

    Map.Entry getOrdersInGap(String firstDate, String lastDate);
}
