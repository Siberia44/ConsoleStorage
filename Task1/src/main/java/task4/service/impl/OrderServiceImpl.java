package task4.service.impl;

import task4.dao.IDAOOrder;
import task4.service.OrderService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import java.util.TreeMap;

public class OrderServiceImpl implements OrderService {
    IDAOOrder daoOrder;

    public OrderServiceImpl(IDAOOrder daoOrder) {
        this.daoOrder = daoOrder;
    }

    @Override
    public void putInfoAboutOrderIntoMap(LocalDate date, Map map) {
        daoOrder.putOrderIntoOrderMap(date, map);
    }

    @Override
    public Map getNearestOrder(String date) {
        LocalDate nearestDate = parseDateFromString(date);
        TreeMap<LocalDate, Map> map = daoOrder.getOrdersMap();
        LocalDate before = map.floorKey(nearestDate);
        LocalDate after = map.ceilingKey(nearestDate);
        if (before == null) {
            return map.get(after);
        }
        if (after == null) {
            return map.get(before);
        }
        return (nearestDate.toEpochDay() - before.toEpochDay() < after.toEpochDay() - nearestDate.toEpochDay()
                || after.toEpochDay() - nearestDate.toEpochDay() < 0)
                && nearestDate.toEpochDay() - before.toEpochDay() > 0 ? map.get(before) : map.get(after);
    }


    @Override
    public Map getOrdersInGap(String firstDate, String lastDate) {
        LocalDate startDate = parseDateFromString(firstDate);
        LocalDate finishDate = parseDateFromString(lastDate);
        TreeMap<LocalDate, Map> map = daoOrder.getOrdersMap();
        return map.subMap(startDate,true,finishDate,true);
    }

    private LocalDate parseDateFromString(String date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return LocalDate.parse(date, formatter);
    }
}
