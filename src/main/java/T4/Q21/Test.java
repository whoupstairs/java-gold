package T4.Q21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Consumer<String> c = str -> {
            list.add(str);
    };
        LazyExecute.execute(c);
        System.out.println(list.size());
    }
}
