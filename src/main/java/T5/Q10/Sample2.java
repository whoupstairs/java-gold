package T5.Q10;

import java.io.*;

public class Sample2 {
    public static void main(String[] args) throws Exception {
        final var fis = new FileInputStream("sample.ser");
        final var in = new ObjectInputStream(fis);
        try (in) {
            Object obj = in.readObject();
            final var item = (Item) obj;
            System.out.println(item);
        }
    }
}
