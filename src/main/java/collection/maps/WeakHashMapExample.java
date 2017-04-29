package collection.maps;

import java.util.WeakHashMap;
/*
Fearlessness isn't a divine gift. Fearlessness is a daily practice.

 */
public class WeakHashMapExample {

    public static void main(String[] args) {

        WeakHashMap<Order, Integer> orders = new WeakHashMap<>();

        orders.put(new Order(1,"my order"),100);
        orders.put(new Order(2,"another order"),200);
        final Order oneMoreOrder = new Order(3, "one more order");
        orders.put(oneMoreOrder,300);
        System.out.println("Size before System.gc is :"+orders.size());
        System.gc();
        System.out.println("Size After System.gc is :"+orders.size());


    }
}


class Order {

    private int _orderId;
    private String _orderDetails;

    public Order(int orderId, String orderDetails) {
        _orderId = orderId;
        _orderDetails = orderDetails;
    }
}






