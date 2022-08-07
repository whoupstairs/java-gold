package T4.Q7;

import java.util.Optional;

public class MapTest {
    public static void main(String[] args) {
        Optional<String> sample = Optional.ofNullable("test");
        Optional<String> result = sample.map(str -> str.toUpperCase());
        System.out.println(sample.get());
        System.out.println(result.get());
    }
}
