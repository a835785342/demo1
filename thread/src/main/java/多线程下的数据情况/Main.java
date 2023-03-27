package 多线程下的数据情况;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> a = Collections.synchronizedList(new ArrayList<>());
//        List<String> a = new ArrayList<>();
        a.add("a");
        a.add("b");
        a.add("c");
        new Thread(() -> {
            for (int i = 0; i < a.size(); i++) {
                System.out.println(Thread.currentThread().getName() + ":" + a.get(i));
                if (a.get(i).equals("c")) {
                    a.add("d");
                }
            }
        }).start();
        new Thread(() -> {
            for (int i = 0; i < a.size(); i++) {
                System.out.println(Thread.currentThread().getName() + ":" + a.get(i));
            }
        }).start();
    }
}
