package com.collections.linkedList.practice3;

public class Main {
    public static void main(String[] args) {
        LlImpl list = new LlImpl();

        list.insert(12);
        list.insert(32);
        list.insert(5);
        list.insert(42);

        list.insertAtStart(39);

        list.show();
    }
}
