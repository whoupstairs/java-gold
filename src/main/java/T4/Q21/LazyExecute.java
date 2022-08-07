package T4.Q21;

import java.util.function.Consumer;

public class LazyExecute {
    public static void execute(Consumer<String> c) {
        c.accept("Hello");
    }
}
