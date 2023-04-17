package com.java8.java8InAction;

import java.util.ArrayList;
import java.util.List;

public class FirstExample {
    public static void main(String[] args) {

        List<Apple> inventory = new ArrayList<>();

        Apple apple = new Apple();
        apple.setColor("Green");
        apple.setWeight(154);

        inventory.add(apple);



        List<Apple> apples = filterGreenApples(inventory);
        System.out.println(apples.get(0).getColor());

    }

    public static List<Apple> filterGreenApples(List<Apple> inventory) {
        List<Apple> result = new ArrayList<>();

        for (Apple apple : inventory) {
            if ("Green".equals(apple.getColor())) {
                result.add(apple);
            }
        }
        return result;
    }


}
