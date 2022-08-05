package T09.Q5;

public class SampleResource implements AutoCloseable {
    @Override
    public void close() throws Exception {
        System.out.println("close");
    }
}
