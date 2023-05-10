package com.java8.java8InAction;

import com.java8.java8InAction.interfaces.AppleGreenColorPredicate;
import com.java8.java8InAction.interfaces.ApplePredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class MainClass {
    public static void main(String[] args) {

        List<Apple> inventory = new ArrayList<>();

        Apple apple = new Apple(80, "Green");
//        apple.setColor("Green");
//        apple.setWeight(154);

        inventory.add(apple);

        List<Apple> greenApple = filterApples(inventory, new AppleGreenColorPredicate());
        System.out.println(greenApple.get(0).getColor());

    }

    public static List<Apple> filterApples(List<Apple> inventory, ApplePredicate p) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (p.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }
}
