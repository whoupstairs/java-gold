package T4.Q10;

import java.util.List;

public class Sample1 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5);
        list.stream().forEach(System.out::println);

        final var stream = list.stream();
    }
}
