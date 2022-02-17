package T10.Q1;

import java.util.Locale;

public class Sample {
    public static void main(String[] args) {
        final var locale = Locale.getDefault();
        System.out.println(locale.getCountry());
        System.out.println(locale.getLanguage());

        final var locale2 = new Locale("ja", "JP");
        System.out.println(locale2.getLanguage());
        System.out.println(locale2.getCountry());

        final var locale3 = Locale.US;
        System.out.println(locale3.getLanguage());
        System.out.println(locale3.getCountry());
    }
}
