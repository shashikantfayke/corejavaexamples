package core;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourceExample {


    public static void main(String[] args) {

        try (BufferedReader br =
                     new BufferedReader(new FileReader("/users/shashikant/abc.txt"))) {
            br.readLine();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

}
