package T2.Q11;

import java.util.function.BiFunction;

public class Bisample {
    public static void main(String[] args) {
        BiFunction<String, String, String> b = (str, addStr) -> str.concat(addStr);

        String result = b.apply("Hello,", "Lambda");
        System.out.println(result);
    }
}
