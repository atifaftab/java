package maybank.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindCommon {
    public static void main(String[] args) {
        String[] array1 = {"apple", "orange", "banana", "grape"};
        String[] array2 = {"grape", "kiwi", "apple", "pear"};

        List<String> list1 = Arrays.stream(array1).toList();
        List<String> list2 = Arrays.stream(array2).toList();

//        System.out.println(list2.contains(list1));
        System.out.println(list1.stream().filter(i -> list2.contains(i)).map(String::new).toList());

    }
}
