package T1.Q8;

public class Main {
    public static void main(String[] args) {
        Sample sample = new Sample() {
            // 匿名クラスにはコンストラクは作れない
            // 匿名クラスはクラス名を持たないため
            /*
            public Sample() {
                System.out.println("B");
            }

             */
        };
    }
}
