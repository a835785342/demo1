package ThreadLocal;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
//        WeakReference weakReference = new WeakReference();
        
        ThreadLocal threadLocal = new ThreadLocal();
        IntStream.range(0,10).forEach(i -> {
            //每个线程的序列号，希望在子线程中能够拿到
            threadLocal.set(i);
            //这里来了一个子线程，我们希望可以访问上面的threadLocal
            System.gc();
            System.out.println(threadLocal.get());
            new Thread(() -> {
                System.out.println(Thread.currentThread().getName() + ":" + threadLocal.get());
            }).start();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
    }

}
