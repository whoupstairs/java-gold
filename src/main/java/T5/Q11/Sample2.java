package T5.Q11;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Sample2 {
    public static void main(String[] args) throws Exception {
        final var in = new ObjectInputStream(new FileInputStream("emp.ser"));
        try (in) {
            final var emp = (Employee) in.readObject();
            System.out.println(emp);
        }
    }
}
