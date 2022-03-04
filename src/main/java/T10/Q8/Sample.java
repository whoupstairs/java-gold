package T10.Q7;

import java.io.FileReader;
import java.util.Properties;
import java.util.Set;

public class Sample {
    public static void main(String[] args) throws Exception {
        final var prop = new Properties();
        prop.load(new FileReader("src/resources/db_settings.properties"));

        final var keys = prop.keySet();
        for (Object key : keys) {
            System.out.println(prop.get(key));
        }

        prop.forEach((k, v) -> System.out.println(k + "=" + v));
    }
}
