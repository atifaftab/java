package com.java8.java8InAction;

import java.util.ArrayList;
import java.util.List;

public class FirstExample {
    public static void main(String[] args) {

        List<Apple> inventory = new ArrayList<>();

        Apple apple = new Apple(80, "Green");
//        apple.setColor("Green");
//        apple.setWeight(154);

        inventory.add(apple);


        List<Apple> applesColors = filterGreenApples(inventory, "Green");
        List<Apple> applesWeight = filterHeavyApples(inventory, 150);
        System.out.println(applesColors.get(0).getColor());
        System.out.println(applesWeight.get(0).getWeight());

    }

    public static List<Apple> filterGreenApples(List<Apple> inventory, String color) {
        List<Apple> result = new ArrayList<>();

        for (Apple apple : inventory) {
            if (color.equals(apple.getColor())) {
                result.add(apple);
            }
        }
        return result;
    }

    public static List<Apple> filterHeavyApples(List<Apple> inventory, int weight) {
        List<Apple> result = new ArrayList<>();

        for (Apple apple : inventory) {
            if (apple.getWeight() > weight) {
                result.add(apple);
            }
        }
        return result;
    }


}
