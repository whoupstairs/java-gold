package T10.Q9;

import java.io.FileReader;
import java.util.Properties;

public class Sample {
    public static void main(String[] args) throws Exception {
        final var prop = new Properties();
        prop.load(new FileReader("src/resources/db_settings.properties"));

        //prop.getProperty("name");
        final var value = prop.getProperty("name");
        final var value2 = prop.get("name");

        System.out.println(value + "," + value2);

    }
}
