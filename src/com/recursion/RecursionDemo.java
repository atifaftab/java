package com.recursion;

public class RecursionDemo {

    public static void main(String[] args) {
        int n =5;
        recursionMethod(5);

    }
    static void recursionMethod(int num){
        if(num<=0)
            return;
        System.out.println(num);
        recursionMethod(num-1);
    }
}
