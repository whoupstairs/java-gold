package T1.Q12;

public class Main {
    public static void main(String[] args) {
        A a = new C();
        // interfaceとclassでメソッドが被った場合、型でinterfaceを指定してもクラスが優先される
        // interfaceはそもそも型を提供するものであり、メソッドの実装を提供するものではない、という考えに基づく
        a.test();
    }
}
