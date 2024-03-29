package T2.Q10;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Function<Integer, Integer> plus = x -> x + 2;
        Function<Integer, Integer> times = x -> x * 2;

        Function<Integer, Integer> a = plus.andThen(times);
        Function<Integer, Integer> b = times.andThen(plus);

        System.out.println(plus.andThen(times).apply(5));
        System.out.println(times.andThen(plus).apply(5));

        System.out.println(a.apply(5));
        System.out.println(b.apply(5));
    }
}
