package T3.Q8;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;

public class Sample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        final var exec = Executors.newSingleThreadExecutor();
        final var future = exec.submit(() -> {
            try {
                System.out.println("start");
                Thread.sleep(20000);
                System.out.println("end");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        if (future.get() == null) {
            System.out.println("finish");
        }
    }
}
