package T1.Q16;

public class Main {
    public static void main(String[] args) {
        // Sampleクラス呼び出し時に、enum Sampleの値の数だけコンストラクタが実行される
        // enmuの値は3つなので三回、コンストラクタが呼ばれて、System.out.printが走る
        // 最後に、ここでのSystem.out.printによる表示がされる
        System.out.println(Sample.A);
    }
}
