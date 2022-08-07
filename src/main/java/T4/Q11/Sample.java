package T4.Q11;

import java.util.Arrays;

public class Sample {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        final var stream = Arrays.stream(array);
        stream.forEach(System.out::println);

        long[] array4 = {1, 2, 3, 4, 5};
        final var stream4 = Arrays.stream(array4);

        double[] array5 = {1, 2, 3, 4, 5};
        final var stream5 = Arrays.stream(array5);

        String[] array2 = {"A", "B", "C"};
        final var stream2 = Arrays.stream(array2);

        Character[] array3 = {'a', 'b', 'c'};
        final var stream3 = Arrays.stream(array3);

    }
}
