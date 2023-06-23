package com.immutable;

import java.util.HashMap;

public final class ImmutableClassDemo {
    private final int id;
    private final String name;
    private final HashMap<Integer, String> mapping;

    public ImmutableClassDemo(int id, String name, HashMap<Integer, String> mapping){
        this.id = id;
        this.name = name;
        this.mapping = (HashMap<Integer, String>) mapping.clone();
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public HashMap<Integer, String> getMapping(){
        return (HashMap<Integer, String>) mapping.clone();
    }

    public static void main(String[] args){

        int i = 01;
        String n = "Atif";
        HashMap<Integer, String> mapped = new HashMap<>();
        mapped.put(10,"Godzilla");

        ImmutableClassDemo immutableObj = new ImmutableClassDemo(i, n, mapped);



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


        HashMap<Integer,String> newMap =  immutableObj.getMapping();
        newMap.put(99,"Kings");
        System.out.println("trying to modify the hashmap");

        System.out.println(immutableObj.mapping);
        
    }
}
