package T4.Q14;

import java.util.List;
import java.util.stream.Stream;

public class FilterSample3 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Stream<Integer> a = list.stream();
        Stream<Integer> b = a.filter(x -> x % 2 == 0);
        b.forEach(System.out::print);
    }
}
