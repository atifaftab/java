package com.java8.lambda;

interface Home {
    void mood(int num);
}

public class LambdaDemo2 {

    public static void main(String[] args) {
        Home obj;
        obj = i -> System.out.println("Number is " + i);
        obj.mood(10);
    }
}
