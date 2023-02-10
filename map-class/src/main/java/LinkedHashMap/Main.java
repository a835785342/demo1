package LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap() {
            @Override
            protected boolean removeEldestEntry(Map.Entry eldest) {
                return size() > 3;
            }
        };
        linkedHashMap.put("a1", "b1");
        linkedHashMap.put("a2", "b2");
        linkedHashMap.forEach((k, v) -> {
            System.out.println(v);
        });


        linkedHashMap.put("a3", "b3");
        linkedHashMap.forEach((k, v) -> {
            System.out.println(v);
        });



    }
}
