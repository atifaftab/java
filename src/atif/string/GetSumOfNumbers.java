package atif.string;

import java.util.Arrays;

public class GetSumOfNumbers {
    public static void main(String[] args) {
        /*
          Please implement this method to
          calculate the sum of all integers found in the parameter String. You can assume that
          integers are separated from other parts with one or more spaces (' ' symbol).
          For example, s="12 some text 3  7", result: 22 (12+3+7=22)
         */
        String s = "12 some text 3  7";
        getSumOfNum(s);

    }

    public static void getSumOfNumbers(String s) {
        int sum = 0;
        String temp = "";
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                temp += c;
            } else if (!temp.isEmpty()) {
                sum += Integer.parseInt(temp);
                temp = "";
            }
        }
        if (!temp.isEmpty()) sum += Integer.parseInt(temp);
        System.out.println("sum = " + sum);
    }

    public static void getSumOfNumber(String s) {
        int sum = 0;
        for (String str : s.split("\\s")) {
            try {
                sum += Integer.parseInt(str);
            } catch (NumberFormatException e) {
                //e.printStackTrace();
            }
        }
        System.out.println(sum);
    }
    public  static void getSumOfNum(String s){
        int sum  = Arrays.stream(s.split("\\s"))
                .filter(str -> str.matches("\\d+"))
                .mapToInt(Integer::parseInt)
                .sum();
        System.out.println("sum = " + sum);

    }
}
