package T10.Q8;

import java.io.FileReader;
import java.util.Properties;

public class Sample {
    public static void main(String[] args) throws Exception {
        final var prop = new Properties();
        prop.load(new FileReader("src/resources/db_settings.properties"));

        prop.list(System.out);
    }
}
