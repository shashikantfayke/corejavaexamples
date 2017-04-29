package core;


public class MainVsStaticBlock {


    public static void main(String[] args) {

        System.out.println("Main Method wins");
    }

    static {


        System.out.println("Static block wins");
    }
}
