package synchronized使用;

//资源类
class MyService {
    private Integer lock = 1234;

    public void testMethod() {
        try {
            synchronized (lock) {
                System.out.println(Thread.currentThread().getName() + " begin "
                        + System.currentTimeMillis());
                lock = 4567;
                Thread.sleep(2000);
                System.out.println(Thread.currentThread().getName() + "   end "
                        + System.currentTimeMillis());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

//线程B
class ThreadB1 extends Thread {

    private MyService service;

    public ThreadB1(MyService service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.testMethod();
    }
}

//线程A
class ThreadA1 extends Thread {

    private MyService service;

    public ThreadA1(MyService service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.testMethod();
    }
}

//测试
public class Run1 {
    public static void main(String[] args) throws InterruptedException {

        //临界资源
        MyService service = new MyService();

        //线程A
        ThreadA1 a = new ThreadA1(service);
        a.setName("A");

        //线程B
        ThreadB1 b = new ThreadB1(service);
        b.setName("B");

        a.start();
        Thread.sleep(50);// 存在50毫秒
        b.start();
    }
}/* Output(循环):
       A begin 1484319778766
       B begin 1484319778815
       A   end 1484319780766
       B   end 1484319780815
 *///:~
