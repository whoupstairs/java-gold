package T4.Q19;

import java.util.Arrays;
import java.util.List;

public class Sample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        final var result = list.stream().reduce(0, (a,b) -> a + b);
        System.out.println(result);
    }
}
