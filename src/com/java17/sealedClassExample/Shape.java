package com.java17.sealedClassExample;

public sealed class Shape permits Circle, Rectangle{
    public void print(){
        System.out.println("true = " + true);
    }
}
final class Circle extends Shape{
    @Override
    public void print(){
        System.out.println("true = " + true);
    }
    
}
non-sealed class Rectangle extends Shape{
    
}