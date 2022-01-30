package T3.Q9;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;

public class Sample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        final var exec = Executors.newSingleThreadExecutor();
        final var future = exec.submit(() -> {
            try {
                System.out.print("start");
                Thread.sleep(20000);
                System.out.println("end");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }, "finish");

        final var result = future.get();
        System.out.println(result);
    }
}
