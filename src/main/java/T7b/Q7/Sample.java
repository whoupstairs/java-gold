package T7b.Q7;

public class Sample {
    public static void main(String[] args) {
        Test<?> test = new Test<>("Hello");
        final var msg = test.getValue();
        test.setValue(null);
    }
}
