package T4.Q16;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Sample {
    public static void main(String[] args) {
        String[] array = {"A", "B", "C"};
        Stream<String> stream = Arrays.stream(array);
        //Optional<String> result = stream.findAny();
        //result.ifPresent(System.out::println);

        //Optional<String> result = stream.findFirst();
        //result.ifPresent(System.out::println);

        List<Integer> list = List.of(1, 2, 3, 4, 5);
        list.parallelStream()
                //.findAny()
                .findFirst()
                .ifPresent(System.out::println);
    }
}
