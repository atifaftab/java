package atif.collections.list.sort.string;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LengthBasedSortingString {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("panda");
        list.add("tom");
        list.add("doremon");
        list.add("sinchan");

        //old method
        //list.sort((a,b) -> a.length() - b.length());
        //list.sort((a,b) -> a.compareTo(b));


        // new method
//        list.sort(Comparator.comparingInt(String::length));
//        list.sort(String::compareTo);
        System.out.println(list.stream().collect(Collectors.groupingBy(String::length)));
        System.out.println("-----");
        System.out.println(list.stream().sorted().toList());
        System.out.println("-----");

        System.out.println(list.stream().sorted(Comparator.reverseOrder()).toList());
        System.out.println("-----");

//        list.sort(Comparator.reverseOrder());
//        System.out.println(list);

        System.out.println(list.stream().sorted(Comparator.comparing(String::length)).toList());
    }
}
