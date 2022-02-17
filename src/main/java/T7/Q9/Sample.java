package T7.Q9;

public class Sample {
    public static void main(String[] args) {
        Test<? super B> a = new Test<A>(new A());
        Test<? super B> b = new Test<B>(new B());
        //Test<? super B> c = new Test<C>(new C());

        //a.setValue(new A());
        a.setValue(new B());
        b.setValue(new C());

        final var objA = a.getValue();
        final var objB = b.getValue();

        final var aObj = (A) a.getValue();
        final var bObj = (B) b.getValue();
    }
}
