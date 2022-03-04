package T5.Q11;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Sample {
    public static void main(String[] args) throws Exception {
        final var out = new ObjectOutputStream(new FileOutputStream("emp.ser"));
        try (out) {
            final var emp = new Employee("sample", "0312345678", "test");
            out.writeObject(emp);
        }
    }
}
