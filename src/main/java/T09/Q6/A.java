package T09.Q6;

public class A implements AutoCloseable {
    @Override
    public void close() throws Exception {
        System.out.println("A");
    }
}
