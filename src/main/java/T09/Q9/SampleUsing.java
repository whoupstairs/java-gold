package T09.Q9;

public class SampleUsing {
    public static void main(String[] args) {
        try (final var resource = new SampleResource();) {
            throw new Exception();
        } catch (Exception e) {
            for (Throwable t : e.getSuppressed()) {
                System.out.println(t);
            }
        } finally {
            System.out.println("finally");
        }
    }
}
