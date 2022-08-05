package T09.Q6;

public class B implements AutoCloseable {
    @Override
    public void close() throws Exception {
        System.out.println("B");
    }
}
