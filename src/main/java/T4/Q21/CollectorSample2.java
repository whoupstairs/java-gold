package T4.Q21;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class CollectorSample2 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("A", "B", "C", "D", "E");

        final var builder = new StringBuilder();

        Consumer<String> c = str -> {
            if (builder.length() != 0) {
                builder.append(",");
            }
            builder.append(str);
        };

        list.stream().forEach(c);
        System.out.println(builder);
    }
}
