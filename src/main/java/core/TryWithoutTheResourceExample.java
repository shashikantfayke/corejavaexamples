package core;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import static java.util.Objects.nonNull;

public class TryWithoutTheResourceExample {


    public static void main(String[] args) {
        BufferedReader reader = null;
        try {
            reader=new BufferedReader(new FileReader("/users/shashikant/abc.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        finally {
             if (nonNull(reader)){

                 try {
                     reader.close();
                 } catch (IOException e) {
                     e.printStackTrace();
                 }
             }
        }
    }
}
