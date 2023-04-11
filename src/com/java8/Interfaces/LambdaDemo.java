package com.java8.Interfaces;

interface Mobile {
    void call();
}

public class LambdaDemo {
    public static void main(String[] args) {

        Mobile obj;
        obj = () -> System.out.println("Calling...  ");
        obj.call();
    }
}
