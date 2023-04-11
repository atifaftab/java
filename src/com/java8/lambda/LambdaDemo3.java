package com.java8.lambda;


interface Games {
    void pubg(int rating);
}

public class LambdaDemo3 {
    public static void main(String[] args) {
        Games obj;
        obj = i -> System.out.println("Rating is " + i);
        obj.pubg(9);
    }

}
