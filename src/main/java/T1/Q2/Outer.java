package T1.Q2;

public class Outer {
    class Inner {
        public void test() {
            System.out.println("test");
        }
    }

    public static void main(String[] args) {
        //new Inner();
        //new Outer.Inner();
        new Outer().new Inner();
        //new Outer:Inner();
    }
}
