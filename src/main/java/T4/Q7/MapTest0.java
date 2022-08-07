package T4.Q7;

import java.util.Optional;

public class MapTest0 {
    public static void main(String[] args) {
        Optional<String> sample = Optional.of("test");
        Optional<String> result = null;
        if (sample.isPresent()) {
            final var str = sample.get();
            result = Optional.of(str.toUpperCase());
        }
        System.out.println(sample.get());
        System.out.println(result.get());
    }
}
