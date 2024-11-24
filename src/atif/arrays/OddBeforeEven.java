package atif.arrays;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class OddBeforeEven {
    //put odd numbers before even numbers
    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2, 4, 5, 7, 9, -2, 3};

//        Arrays.sort(numbers);
        int[] copyArr = new int[numbers.length];
        int j = 0, k = numbers.length - 1;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                copyArr[j++] = numbers[i];
            } else {
                copyArr[k--] = numbers[i];
            }
        }
        System.out.println(Arrays.toString(copyArr));

        //second method
        System.out.println("-----2nd method -----");
        int[] carr = new int[numbers.length];
        int x = 0;
        int y = numbers.length - 1;
        for (int i : numbers) {
            if (i % 2 != 0) {
                carr[x++] = i;
                continue;
            }
            carr[y--] = i;
        }
        System.out.println(Arrays.toString(carr));

        //using stream
        System.out.println("-----3rd method -----");

//        Object[] newArray = Stream.of(
//                        IntStream.of(numbers).filter(i -> i % 2 != 0).boxed().toArray(),
//                        IntStream.of(numbers).filter(i -> i % 2 == 0).boxed().toArray())
//                .flatMap(Arrays::stream)
//                .toArray();

        Integer[] newArray = Stream.concat(
                IntStream.of(numbers).filter(i -> i % 2 != 0).boxed(),
                IntStream.of(numbers).filter(i -> i % 2 == 0).boxed()
        ).toArray(Integer[]::new);
        System.out.println(Arrays.toString(newArray));


        System.out.println("-----  practice -----");

        int start = 0, end = numbers.length - 1;
        int[] oddEvenArray = new int[numbers.length];
        for (int n : numbers) {
            if (n % 2 != 0) {
                oddEvenArray[start++] = n;
                continue;
            }
            oddEvenArray[end--] = n;
        }
        System.out.println(Arrays.toString(oddEvenArray));
    }
}
