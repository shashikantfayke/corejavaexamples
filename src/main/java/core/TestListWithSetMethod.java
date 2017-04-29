package core;

import java.util.ArrayList;
import java.util.List;

public class TestListWithSetMethod {

    public static void main(String[] args) {

        List<Integer> values=new ArrayList<>();
        values.add(1);
        values.add(2);
        values.add(3);
        values.remove(0);
        values.set(1,6);

        values.forEach(integer -> System.out.println(integer));
    }

}
