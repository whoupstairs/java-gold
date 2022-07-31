package T7b.Q9;

public class Sample {
    public static void main(String[] args) {
        Test<? super B> a = new Test<A>(new A());
        Test<? super B> b = new Test<B>(new B());
        //Test<? super B> c = new Test<C>(new C());

        //a.setValue(new A());
        a.setValue(new B());
        a.setValue(new C());

        b.setValue(new B());
        b.setValue(new C());

        var objA = a.getValue();
        var objB = b.getValue();

        A aObj = (A)a.getValue();
        B bObj = (B)b.getValue();
    }
}
