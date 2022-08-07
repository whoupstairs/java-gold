package T2.Q8;

import java.util.function.BiPredicate;

public class Main {
    public static void main(String[] args) {
        final BiPredicate<String, String> p = (str, suffix) -> str.endsWith(suffix);

        System.out.println(p.test("abc", "c"));
    }
}
