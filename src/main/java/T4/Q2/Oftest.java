package T4.Q2;

import java.util.Optional;

public class Oftest {
    public static void main(String[] args) {
        Optional<String> sample = Optional.ofNullable(null);
        System.out.println(sample.get());
    }
}
