package T4.Q3;

import java.util.Optional;

public class GetTest {
    public static void main(String[] args) {
        Optional<String> sample = Optional.empty();
        System.out.println(sample.orElse("empty"));

        sample = Optional.of("sample");
        System.out.println(sample.orElse("empty"));

        //System.out.println(sample.orElseGet(() -> "else"));
    }
}
