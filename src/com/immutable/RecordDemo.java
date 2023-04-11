package com.immutable;

import java.util.HashMap;

public record RecordDemo(int id, String name, HashMap<Integer, String> mapping) {
    public RecordDemo(int id, String name, HashMap<Integer, String> mapping) {
        this.id = id;
        this.name = name;
        this.mapping = (HashMap<Integer, String>) mapping.clone();
    }

    @Override
    public HashMap<Integer, String> mapping() {
        return (HashMap<Integer, String>) mapping.clone();
    }

    public static void main(String[] args) {

        int i = 01;
        String n = "Atif";
        HashMap<Integer, String> mapped = new HashMap<>();
        mapped.put(10, "Godzilla");

        RecordDemo immutableObj = new RecordDemo(i, n, mapped);


        System.out.println("Before any changes ");
        System.out.println(immutableObj.id);
        System.out.println(immutableObj.name);
        System.out.println(immutableObj.mapping);


        i = 99;
        n = "any Name";
        mapped.put(20, "king Kong");

        System.out.println("After any changes ");
        System.out.println(immutableObj.id);
        System.out.println(immutableObj.name);
        System.out.println(immutableObj.mapping);


        HashMap<Integer, String> newMap = immutableObj.mapping();
        newMap.put(99, "Kings");

        System.out.println(immutableObj.mapping);

    }
}
