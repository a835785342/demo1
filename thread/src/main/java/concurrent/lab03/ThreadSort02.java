package concurrent.lab03;

public class ThreadSort02 {
    public static void main(String[] args) throws InterruptedException {

        Thread thread1 = new Thread(() -> {
            System.out.println("thread1");
        });
        Thread thread2 = new Thread(() -> {
            System.out.println("thread2");
        });
        Thread thread3 = new Thread(() -> {
            System.out.println("thread3");
        });

        thread1.start();

        //实际上让主线程等待子线程执行完成
        thread1.join();

        thread2.start();
        synchronized (thread2){
            thread2.wait(0);
        }
        

        thread3.start();
        synchronized (thread3){
            thread3.wait(0);
        }
    }
}
