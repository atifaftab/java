/*map to to LinkedList*/
package com.collections.linkedList;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class MapToLinkedList {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("name", 0);
        map.put("game", 1);
        map.put("fame", 29);
        map.put("lame", 28);

//        map.forEach((i, j) -> System.out.println(i + " " + j));
        System.out.println(map);

        List<String> keyLinkedList = new LinkedList<>();
        List<Integer> valueLinkedList = new LinkedList<>();

        for (Map.Entry data : map.entrySet()) {
            keyLinkedList.add((String) data.getKey());
            valueLinkedList.add((Integer) data.getValue());
        }

        keyLinkedList.forEach(i -> System.out.println("key LinkedList " + i));
        valueLinkedList.forEach(i -> System.out.println("value LinkedList " + i));

    }
}
