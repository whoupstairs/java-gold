package T1.Q11;

public class Sample implements A, D {
    @Override
    public void test() {
        A.super.test();
        //B.super.test(); //このクラスで直接Bクラスを実装していないからNG
        //C.super.test(); //Cクラスの中にはデフォルトメソッドとしてのtest()がないからNG
    }
}
