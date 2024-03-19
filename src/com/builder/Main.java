package com.builder;

public class Main {
    public static void main(String[] args) {
        Person person = Person.builder()
                .name("Atif")
                .age(28)
                .address(new Address("32"))
                .build();
        System.out.println("person = " + person);
    }
}
