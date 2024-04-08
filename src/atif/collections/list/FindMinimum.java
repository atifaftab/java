package atif.collections.list;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FindMinimum {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        int min = num.get(0);
        for (int i = 0; i < num.size(); i++) {
            if (num.get(i) < min)
                min = num.get(i);
        }
        System.out.println("min = " + min);


        //using java8
        Optional<Integer> min1 = num.stream().min(Integer::compareTo);
        min1.ifPresent(System.out::println);
        System.out.println("------");
        //using Collectors.minBy
        System.out.println(num.stream().collect(Collectors.minBy(Comparator.comparing(Integer::intValue))).get());
    }
}
