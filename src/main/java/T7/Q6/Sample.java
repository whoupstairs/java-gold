package T7.Q6;

import java.util.Collection;
import java.util.List;

public class Sample {
    public static void main(String[] args) {
        List<Integer> a = List.of(1, 2, 3, 4, 5);
        List<String> b = List.of("A", "B", "C");

        //printAll1(a);
        printAll1(b);

        //printALl2(a);
        //printALl2(b);


        printAll3(a);
        printAll3(b);

    }

    private static void printAll1(Collection<String> collection) {
        collection.stream().forEach(System.out::println);
    }

    private static void printALl2(Collection<Object> collection) {
        collection.stream().forEach(System.out::println);
    }

    private static void printAll3(Collection<?> collection) {
        collection.stream().forEach(System.out::println);
    }
}
