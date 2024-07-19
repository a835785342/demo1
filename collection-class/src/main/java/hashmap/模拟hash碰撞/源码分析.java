package hashmap.模拟hash碰撞;

import java.util.HashMap;

public class 源码分析 {
    public static void main(String[] args) {
        HashMap<App, Integer> hashMap = new HashMap();
        for (int i = 0; i < 20; i++) {
            App app = new App();
            app.setId(2);
            hashMap.put(app, i);
        }
    }
}
