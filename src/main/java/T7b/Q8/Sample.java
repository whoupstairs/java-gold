package T7b.Q8;

public class Sample {
    public static void main(String[] args) {
        Test<? extends B> test = new Test<B>(new B());
        B b = test.getValue();
        b.hello();

        Test<? extends B> test2 = new Test<C>(new C());
        B b2 = test2.getValue();
        b2.hello();
    }
}
