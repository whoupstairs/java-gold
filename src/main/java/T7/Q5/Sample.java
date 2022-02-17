package T7.Q5;

public class Sample {
    public static void main(String[] args) {
        Test<A> a = new Test<>();
        Test<B> b = new Test<>();
        //Test<C> c = new Test<>();

        a.execute(new A());
        a.execute(new B());
        b.execute(new B());
    }
}
