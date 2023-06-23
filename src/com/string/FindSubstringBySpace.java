package com.string;

public class FindSubstringBySpace {
    public static void main(String[] args) {
        String s = "Hi there";
        s = s + " ";

        System.out.println("original string : " + s);
        String newStr = "";
        for (char c : s.toCharArray()) {
            if (c != ' ') {
                newStr +=  c;
            } else {
                System.out.println(newStr);
                newStr = "";
            }
        }
    }
}
