package common.reaserchingExceptions;

import java.io.*;

public class Main1 {
    private static final String FILE_NAME = "Vlad.txt";

    public static void main(String[] args) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try {
            fos = new FileOutputStream(FILE_NAME, true);
            oos = new ObjectOutputStream(fos);
            fis = new FileInputStream(FILE_NAME);
            ois = new ObjectInputStream(fis);
            Person person = new Person("Alex", 12);
            oos.writeObject(person);
            System.out.println(ois.readObject());
            int read = fis.read();
            while (read != -1) {
                System.out.print((char) read);
                read = fis.read();
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (fos != null & oos != null & fis != null & ois != null) {
                try {
                    fos.close();
                    oos.flush();
                    oos.close();
                    fis.close();
                    ois.close();
                    System.out.println("Streams are closed");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
