package T4.Q19;

import java.util.Arrays;
import java.util.List;

public class Sample2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        final var result = list.stream().reduce((a, b) -> {
           int c = a + b;
           System.out.print("a = " + a);
           System.out.print(", b = " + b);
           System.out.println(", a + b = " + c);
           return c;
        });
        result.ifPresent(System.out::println);
    }
}
