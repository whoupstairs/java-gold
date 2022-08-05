package T2.Q2;

import java.util.function.Supplier;

public class Test {
    public static void execute(Supplier<A> supplier) {
        System.out.println("お決まりの事前処理");
        final var a = supplier.get();
        a.hello();
        System.out.println("お決まりの事後処理");
    }
}
