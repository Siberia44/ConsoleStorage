package task4.service.impl;

import task4.dao.IDAOOrder;
import task4.service.OrderService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class OrderServiceImpl implements OrderService {
    IDAOOrder daoOrder;

    public OrderServiceImpl(IDAOOrder daoOrder) {
        this.daoOrder = daoOrder;
    }

    @Override
    public void putInfoAboutOrderIntoMap(Date date, Map map) {
        daoOrder.putOrderIntoOrderMap(date, map);
    }

    @Override
    public Map getNearestOrder(String date) {
        Date date1 = parseDateFromString(date);
        TreeMap<Date, Map> map = daoOrder.getOrdersMap();
        Date before = map.floorKey(date1);
        Date after = map.ceilingKey(date1);
        if (before == null) {
            return map.get(after);
        }
        if (after == null) {
            return map.get(before);
        }
        return (date1.getTime() - before.getTime() < after.getTime() - date1.getTime()
                || after.getTime() - date1.getTime() < 0)
                && date1.getTime() - before.getTime() > 0 ? map.get(before) : map.get(after);
    }


    @Override
    public Map.Entry getOrdersInGap(String firstDate, String lastDate) {
        Date startDate = parseDateFromString(firstDate);
        Date finishDate = parseDateFromString(lastDate);
        TreeMap<Date, Map> map = daoOrder.getOrdersMap();
        Map.Entry arrayList1 =  map.floorEntry(finishDate);
        Map.Entry arrayList2 =  map.ceilingEntry(startDate);
        if (arrayList1 == null){
            return arrayList2;
        }
        if (arrayList2 == null){
            return arrayList1;
        }
        Map mapTry = new HashMap();
        return arrayList2;
    }

    private Date parseDateFromString(String date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy");
        try {
            return simpleDateFormat.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
}
