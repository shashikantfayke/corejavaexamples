
public class TestTryCatchWithError {


    public static void main(String[] args) {

        try{

            badMethod();
            System.out.println("Below Bad Method");

        } catch (Exception ex){
            System.out.println("Exception Caught");
        }
        finally {
            System.out.println("Finally It is called");
        }

        System.out.println("The End");

    }

    private static void badMethod() {


        throw  new Error();
    }
}
