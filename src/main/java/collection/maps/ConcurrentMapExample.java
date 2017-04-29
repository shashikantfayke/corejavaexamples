package collection.maps;


import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

public class ConcurrentMapExample {

    static Map<String, AtomicLong> orders = new ConcurrentHashMap<>();

    public static void main(String[] args) throws InterruptedException {
        orders.put("Dehli",new AtomicLong());
        orders.put("Mumbai",new AtomicLong());
        orders.put("Newyork",new AtomicLong());
        orders.put("Paris",new AtomicLong());
        
        ExecutorService executorService= Executors.newFixedThreadPool(2);

        executorService.submit(ConcurrentMapExample::processOrders);
        executorService.submit(ConcurrentMapExample::processOrders);
        executorService.awaitTermination(1, TimeUnit.SECONDS);
        executorService.shutdown();
        System.out.println(orders);
    }

    public static void processOrders(){

        for (String city:orders.keySet()){
            for (int i=0;i<50;i++){
                orders.get(city).getAndIncrement();
            }
        }
    }


}
