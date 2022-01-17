package T1.Q9;

public class D implements A {
    public static void main(String[] args) {
        // interfaceに実装されたstaticメソッドは継承されない
        // 実装されたinterfaceを指定して呼ぶ必要がある
        A.test();
        //B.test();
        //C.test();
        //test();
    }
}
