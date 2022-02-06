package T4.Q2;

import java.util.Optional;

public class GetTest {
    public static void main(String[] args) {
        //Optional<String> sample = Optional.of("Hello");
        Optional<String> sample = Optional.empty();
        /*
        if (sample.isPresent()) {
            System.out.println(sample.get());
        }

         */
        if (sample.isEmpty()) {
            System.out.println("empty");
            return;
        }
        System.out.println(sample.get());
    }
}
