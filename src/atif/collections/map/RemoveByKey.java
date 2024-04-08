package atif.collections.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class RemoveByKey {
    public static void main(String[] args) {
        int key = 1;
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "atif");
        map.put(2, "adil");
        map.put(3, "amir");

        System.out.println(map);

        Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<Integer, String> entry = iterator.next();
            if (key == entry.getKey()) {
                iterator.remove();
            }
        }
        System.out.println(map);
    }
}
