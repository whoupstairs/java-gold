package T4.Q16;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Test0 {
    public static void main(String[] args) {
        String[] array = {"A", "B", "C"};
        Stream<String> stream = Arrays.stream(array);
        Optional<String> result = stream.findAny();
        result.ifPresent(System.out::println);

        String[] array2 = {"A", "B", "C"};
        Stream<String> stream2 = Arrays.stream(array);
        Optional<String> result2 = stream2.findFirst();
        result2.ifPresent(System.out::println);

        List<Integer> list = List.of(1, 2, 3, 4, 5);
        list.parallelStream()
                .findAny()
                .ifPresent(System.out::println);

        list.parallelStream()
                .findFirst()
                .ifPresent(System.out::println);

        Predicate<Integer> p = num -> {
            boolean result3 = num % 2 == 0;
            System.out.println(num + ":" + result3);
            return result3;
        };

        list.parallelStream()
                .filter(p)
                .forEach(System.out::println);
    }
}
