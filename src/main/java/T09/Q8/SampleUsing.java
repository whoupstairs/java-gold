package T09.Q8;

import T09.Q5.SampleResource;

public class SampleUsing {
    public static void main(String[] args) {
        try (final var resource = new SampleResource();) {
            throw new Exception();
        } catch (Exception e) {
            System.out.println("catch");
        } finally {
            System.out.println("finally");
        }
    }
}
