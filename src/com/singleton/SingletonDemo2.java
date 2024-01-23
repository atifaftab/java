package com.singleton;

public class SingletonDemo2 {
    public static void main(String[] args) {
        SingletonClass2 obj1 = SingletonClass2.getInstance();
        SingletonClass2 obj2 = SingletonClass2.getInstance();
        SingletonClass2 obj3 = SingletonClass2.getInstance();


        if(obj1 == obj2 && obj2 == obj3){
            System.out.println("same obj");
            return;
        }
        System.out.println("NOT SAME OBJ");


    }
}
class SingletonClass2 {
    private static SingletonClass2 singletonObj = null;
    private SingletonClass2(){}

    public static SingletonClass2 getInstance(){
        if(singletonObj == null){
            singletonObj = new SingletonClass2();
        }
        return singletonObj;
    }
}
