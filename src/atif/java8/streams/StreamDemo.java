package atif.java8.streams;

import java.util.*;
import java.util.stream.Collectors;

public class StreamDemo {
    public static void main(String[] args) {

        //mapping and sorting,  collecting as list
        List<Integer> listNum = Arrays.asList(3, 4, 5, 2, 7, 9);
        List<Integer> mappedList = listNum.stream().sorted().map(i -> i * 2).collect(Collectors.toList());
        System.out.println(mappedList);

        //filter
        List<String> nameList = Arrays.asList("tamp", "Bedok", "Marina", "am");
        List<String> filteredList = nameList.stream().filter(i -> i.contains("am")).collect(Collectors.toList());
        System.out.println(filteredList);

        //collecting as set
        Set<Integer> setNum = listNum.stream().sorted().map(i -> (i - 2)).collect(Collectors.toSet());
        System.out.println(setNum);

        //foreach
        listNum.stream().sorted().forEach(i -> System.out.println(i * 2));
    }
}
