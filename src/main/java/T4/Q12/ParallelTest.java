package T4.Q12;

import java.util.Arrays;
import java.util.List;

public class ParallelTest {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("A", "B", "C", "D", "E");
        final var stream = list.stream();
        stream.forEach(System.out::println);
    }
}
