package T5.Q5;

import java.io.FileWriter;

public class Sample {
    public static void main(String[] args) throws Exception {
        FileWriter out = new FileWriter("output.txt", false);
        try (out) {
            out.write("\n");
            out.write("Hello, Java");
        }
    }
}
