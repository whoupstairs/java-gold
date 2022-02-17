package T7.Q6;

public class Test {
    public static void main(String[] args) {

        final var targetText = "aaaa";

        final var regex ="\\p{Punct}";

        final var replaceText = targetText.replaceAll(regex, "");


    }
}
