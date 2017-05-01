package core;

import java.util.Arrays;
import java.util.StringTokenizer;

public class CountWordsInAString {

    public static void main(String[] args) {

        String myCountry="India-is-great-country";

        final String[] splits = myCountry.split("-");
        Arrays.stream(splits).forEach(System.out::println);
        StringTokenizer stringTokenizer=new StringTokenizer(myCountry,"-");
        while(stringTokenizer.hasMoreTokens()){

            System.out.println(stringTokenizer.nextElement());
        }
    }
}
