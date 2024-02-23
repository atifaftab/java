package com.collections.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class RemoveByValue {
    public static void main(String[] args) {

        String value = "adil";
        Map<String, String> map = new HashMap<>();
        map.put("atif", "atif");
        map.put("adil", "adil");
        map.put("amir", "amir");


        System.out.println(map);

//        Iterator<Map.Entry<String ,String >> iterator = map.entrySet().iterator();
//        while (iterator.hasNext()){
//            Map.Entry<String, String> entry = iterator.next();
//            if(value.equals(entry.getValue())){
//                iterator.remove();
//            }
//        }

        map.entrySet().removeIf(entry -> value.equals(entry.getValue()));
        System.out.println(map);
    }

}
