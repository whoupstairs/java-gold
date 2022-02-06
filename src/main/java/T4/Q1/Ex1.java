package T4.Q1;

import java.util.Optional;

public class Ex1 {
    public static void main(String[] args) {
        //final var sample = Optional.of(null);
        //final var sample = Optional.empty();
        final var sample = Optional.ofNullable(null);
        System.out.println(sample);
    }
}
