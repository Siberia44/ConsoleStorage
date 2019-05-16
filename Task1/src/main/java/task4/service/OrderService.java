package task4.service;

import java.time.LocalDate;
import java.util.Date;
import java.util.Map;

public interface OrderService {
    void putInfoAboutOrderIntoMap(LocalDate date, Map map);

    Map getNearestOrder(String date);

    Map getOrdersInGap(String firstDate, String lastDate);
}
