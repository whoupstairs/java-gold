package T4.Q12;

import java.util.HashSet;

public class Test {
    public static void main(String[] args) {
        final var set = new HashSet<>();
        set.add("E");
        set.add("D");
        set.add("C");
        set.add("B");
        set.add("A");
        final var stream = set.stream();
        stream.forEach(System.out::println);
    }
}
