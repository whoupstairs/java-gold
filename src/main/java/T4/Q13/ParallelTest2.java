package T4.Q13;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ParallelTest2 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("A", "B", "C", "D", "E");
        Stream<String> stream = list.parallelStream();
        stream.forEachOrdered(System.out::println);
    }
}
