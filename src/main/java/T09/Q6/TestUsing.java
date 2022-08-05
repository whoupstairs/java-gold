package T09.Q6;

public class TestUsing {
    public static void main(String[] args) throws Exception {

        final var a = new A();
        try (a; final var b = new B(); final var c = new C()) {
            System.out.println("Hello, World!");
        }
    }
}
