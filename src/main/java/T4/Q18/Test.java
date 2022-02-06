package T4.Q18;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        final var list = Arrays.asList(1, 2, 3, 4, 5);
        final var result = list.stream().map(n -> String.valueOf(n));
    }
}
