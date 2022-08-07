package T4.Q14;

import java.util.List;

public class FilterSample4 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        list.stream()
                .filter(x -> x > 5)
                .filter(x -> x % 2 == 0)
                .forEach(System.out::print);
    }
}
