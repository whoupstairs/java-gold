package T5.Q4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class NewSample {
    public static void main(String[] args) throws IOException {
        final var fr = new FileReader("sample.txt");
        final var reader = new BufferedReader(fr);
        try (reader) {
            reader.lines().forEach(System.out::println);
        }
    }
}
