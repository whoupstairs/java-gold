package T09.Q6;

public class C implements AutoCloseable {
    @Override
    public void close() throws Exception {
        System.out.println("C");
    }
}
