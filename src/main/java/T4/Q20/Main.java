package T4.Q20;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("B", "A", "D", "C");
        Optional<String> result = list.stream().max((a, b) -> a.compareTo(b));
        //final var result2 = list.stream().max((a, b) -> a.compareTo(b));
        result.ifPresent(System.out::println);
    }
}
