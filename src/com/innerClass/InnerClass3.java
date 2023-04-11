package com.innerClass;


interface Names {
    void myName(String name);
}

public class InnerClass3 {
    public static void main(String[] args) {
        Names obj = new Names() {
            public void myName(String name) {
                System.out.println("My name is " + name);
            }
        };
        obj.myName("OTH");
    }
}
