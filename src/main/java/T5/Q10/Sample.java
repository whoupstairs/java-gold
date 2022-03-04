package T5.Q10;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Sample {
    public static void main(String[] args) throws IOException {
        final var fos = new FileOutputStream("sample.ser");
        final var out = new ObjectOutputStream(fos);

        try (out) {
            final var item = new Item("apple", 100);
            out.writeObject(item);
        }
    }
}
