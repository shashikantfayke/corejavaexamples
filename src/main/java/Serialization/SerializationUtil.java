package Serialization;


import java.io.*;

public class SerializationUtil {

    public void serialize(Object object, String fileName) throws IOException {

        FileOutputStream fos = new FileOutputStream(fileName);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(object);

    }

    public Object deserialize(String fileName) throws IOException, ClassNotFoundException {

        FileInputStream fis = new FileInputStream(fileName);
        ObjectInputStream ois = new ObjectInputStream(fis);
        final Object readObject = ois.readObject();
        return readObject;
    }

}
