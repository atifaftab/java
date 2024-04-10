package atif.string;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseString {
    public static void main(String[] args) {

        String hello = new String("Hello World");
        System.out.println(hello);


      /*  //1st way
        String reverse = "";
        for (int i = hello.length() - 1; i >= 0; i--) {
            reverse += hello.charAt(i);
        }
            System.out.println(reverse);
        */

       /* //2nd way by charArray
        char[] charArr = hello.toCharArray();
        for (int i = charArr.length - 1; i >= 0; i--) {
            System.out.print(charArr[i]);
        }*/

       /* //3rd way by StringBuffer
        StringBuffer stringBuffer = new StringBuffer(hello);
        System.out.println(stringBuffer.reverse());*/

        //4th way String builder
        StringBuilder stringBuilder = new StringBuilder(hello);
        System.out.println(stringBuilder.reverse());


        String str = "word";

        String reverse = "";

        System.out.println(str);

        for (int i = 0; i < str.length(); i++) {

            reverse = str.charAt(i) + reverse;

        }

        System.out.println(reverse);
    }
}