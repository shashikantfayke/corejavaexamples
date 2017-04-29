package collection.maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*
"It is far, far easier to make a correct program fast than it is to make a fast program correct." - Herb Sutter
 */
public class ConcurrentExceptionExample {


    public static void main(String[] args) {


        Map<String,Integer> scores=new HashMap<>();
        scores.put("player1",1);
        scores.put("player2",1);
        scores.put("player3",1);
        scores.put("player4",1);
        scores.put("player5",1);
        scores.put("player6",1);


        Iterator<String> iterator=scores.keySet().iterator();

        while (iterator.hasNext()){

            System.out.println(scores.get(iterator.next()));
            scores.put("player7",2);

        }
    }

}
