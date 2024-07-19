package concurrent.executor.state;

import java.util.concurrent.TimeUnit;

public class WaitingTime implements Runnable{
    @Override
    public void run() {
        while (true) {
            waitSecond(20);
        }
    }

    public static final void waitSecond(long seconds) {
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
