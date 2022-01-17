package T1.Q10;

public class SampleImpl implements Sample {
    public static void test() {
        System.out.println("B");
    }

    public static void main(String[] args) {
        // interfaceに実装されたstaticメソッドはoverrideできない
        // overrideとはinstanceの振る舞いを指定するもの
        // staticメソッドはinstanceがなくても使えるものなのでoverrideはできない
        Sample.test();

        SampleImpl.test();
    }
}
