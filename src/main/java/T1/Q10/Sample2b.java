package T1.Q10;

public class Sample2b extends Sample2 {

    public static void test() {
        System.out.println("D");
    }

    public static void main(String[] args) {
        Sample2.test();
        test();
    }
}
