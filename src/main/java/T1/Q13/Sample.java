package T1.Q13;

// Bのtest()メソッドがprotectedだと怒られる。
// Aのtest()メソッドがpublicのため
// Aのimplementをやめるか、Bをpublicにする必要がある
public class Sample extends B implements A {
    public static void main(String[] args) {
        new Sample().test();
    }
}
