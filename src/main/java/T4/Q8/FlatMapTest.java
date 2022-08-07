package T4.Q8;

import java.util.Optional;

public class FlatMapTest {
    public static void main(String[] args) {
        Optional<String> a = Optional.of("test");
        //var b = a.map(str -> test(str));
        Optional<String> b = a.flatMap(str -> test(str));
        System.out.println(b.get());
    }

    private static Optional<String> test(String str) {
        return Optional.of(str.toUpperCase());
    }
}
