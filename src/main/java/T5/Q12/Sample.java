package T5.Q12;

import java.io.File;
import java.nio.file.Paths;

public class Sample {
    public static void main(String[] args) throws Exception {

        final var path = Paths.get("resource/sample.txt");
        final var path2 = Paths.get("resource", "sample.txt");
        final var path3 = new File("sample.txt").toPath();
        //final var path4 = Files.get("sample.txt");
        System.out.println(path.toAbsolutePath());
        System.out.println(path2.toAbsolutePath());
        System.out.println(path3.toAbsolutePath());
    }
}
