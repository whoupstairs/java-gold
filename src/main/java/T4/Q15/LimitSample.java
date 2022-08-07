package T4.Q15;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LimitSample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        list.stream()
                .limit(5)
                .forEach(System.out::println);
    }
}
