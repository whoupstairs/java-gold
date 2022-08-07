package T2.Q5;

import java.util.HashMap;
import java.util.function.BiConsumer;

public class Test {
    public static void main(String[] args) {
        final var map = new HashMap<String, Integer>();
        //final BiConsumer<String, Integer> bi = (k, v) -> map.put(k, v);
        final BiConsumer<String, Integer> bi = map::put;

        bi.accept("apple", 3);
        bi.accept("orange", 2);

        System.out.println(map);
    }
}
