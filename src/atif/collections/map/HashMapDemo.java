package atif.collections.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        int key = 1;
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "atif");
        map.put(2, "adil");
        map.put(3, "amir");

        map.forEach((i, j) -> System.out.println(i + " " + j));
        System.out.println(map);

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry);
        }
    }
}
