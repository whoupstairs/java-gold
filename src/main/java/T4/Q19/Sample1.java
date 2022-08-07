package T4.Q19;

import java.util.Arrays;
import java.util.List;

public class Sample1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        final var result = list.stream().reduce((a,b) -> a + b);
        result.ifPresent(System.out::println);
    }
}
