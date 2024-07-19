package volatile使用;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws Exception{
        Aobing aobing = new Aobing();
        aobing.start();
        int i=0;
//        synchronized (aobing) {//上面线程还未把flag置为true，此时获取的aobing对象还是旧值
            for (; ; ) {
                i++;
//                Field field = Unsafe.class.getDeclaredField("theUnsafe");
//                field.setAccessible(true);
//                Unsafe unsafe = (Unsafe) field.get(null);
//                unsafe.storeFence();
                
//                System.out.println(i);
                
//                Thread.yield();
                
//                synchronized (aobing) {//里面for循环synchronized一直获取最新的aobing对象，所以可以打印
                if (aobing.isFlag()) {
                    System.out.println("有点东西"+i);
                    break;
//                }
            }
        }
    }
}

class Aobing extends Thread {
    private boolean flag = false;

    public boolean isFlag() {
        return flag;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        flag = true;
        System.out.println("flag = " + flag);
    }
}
