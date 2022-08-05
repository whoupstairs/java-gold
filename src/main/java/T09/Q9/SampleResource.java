package T09.Q9;

public class SampleResource implements AutoCloseable {
    @Override
    public void close() throws Exception {
        System.out.println("sample");
        throw new RuntimeException("sample");
    }
}
