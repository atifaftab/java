package atif.codingPractice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PairCounter {
    public static void main(String[] args) {
//        int[] array = {1, 1, 2, 2, 3, 3, 3, 1, 1, 4, 4, 4, 4}; // example array
        int[] array = {1, 1, 2, 2, 3, 3, 4, 4, 1, 1, 33}; // example array
        Map<Integer, Integer> mapCounts = new HashMap<>();
        for (int num : array) {
            mapCounts.put(num, mapCounts.getOrDefault(num, 0) + 1);
        }
        int groupCount = 0;
        for (int count : mapCounts.values()) {
            groupCount += (count + 1) / 2;
        }
        System.out.println("Number of groups: " + groupCount);


//        for (int i=0; i<)

    }
}
