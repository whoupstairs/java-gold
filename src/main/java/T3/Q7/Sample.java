package T3.Q7;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Sample {
    public static void main(String[] args) throws InterruptedException {
        final var exec = Executors.newScheduledThreadPool(2);
        exec.scheduleWithFixedDelay(() -> {
            System.out.print("A");
        }, 1, 1, TimeUnit.SECONDS);

        exec.scheduleWithFixedDelay(() -> {
            System.out.print("B");
        }, 1, 1, TimeUnit.SECONDS);

        Thread.sleep(10000);
        exec.shutdown();
    }
}
