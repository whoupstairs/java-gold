package T4.Q15;

import java.util.Arrays;
import java.util.List;

public class DistinctSample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("A", "B", "C", "A");
        list.stream().distinct().forEach(System.out::println);
    }
}
