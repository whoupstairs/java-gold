package T09.Q5;

import java.io.Closeable;
import java.io.IOException;

public class SampleResource2 implements Closeable {
    @Override
    public void close() throws IOException {
        System.out.println("close");
    }
}
