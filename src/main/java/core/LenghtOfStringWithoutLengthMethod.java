package core;


public class LenghtOfStringWithoutLengthMethod {

    public static void main(String[] args) {
        String myString ="blablabla";
        System.out.println(myString.chars().count());//Java 8

        char [] yourString= myString.toCharArray();

        int count=0;
        for(char myChar: yourString){
            count++;
        }
        System.out.println(count);
    }

}
