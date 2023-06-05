package com.string;
//print upper before lower
public class UpperLowerCase {
    public static void main(String[] args) {
        String s = "ciIFdkUf";

        System.out.println("before "+s);
        printUpperCaseThenLowerCase(s);
    }
    private static void printUpperCaseThenLowerCase(String s){
        String up = "";
        String lo = "";

//        for(int i=0; i< s.length(); i++){
//            if(Character.isUpperCase(s.charAt(i))){
//                up = up + s.charAt(i);
//            }
//            if(Character.isLowerCase(s.charAt(i))){
//                lo = lo + s.charAt(i);
//            }
//
//        }

        for( char c: s.toCharArray()){
            if(Character.isUpperCase(c))
                up = up + c;
            if(Character.isLowerCase(c))
                lo = lo + c;
        }


        System.out.println("after "+up + lo);
    }
}
