package atif.java8.java8InAction.prettyApple;

import atif.java8.java8InAction.prettyApple.interfaces.implmentations.AppleSimpleFormatter;
import atif.java8.java8InAction.Apple;
import atif.java8.java8InAction.prettyApple.interfaces.AppleFormatter;

import java.util.Arrays;
import java.util.List;

public class MainDriver {
    public static void main(String[] args) {

        List<Apple> inventory = Arrays.asList(new Apple(80, "Green"),
                new Apple(150, "Green"),
                new Apple(120, "Red")
                );

        prettyPrintApple(inventory, new AppleSimpleFormatter());
    }

    public static void prettyPrintApple(List<Apple> inventory, AppleFormatter p) {
        for (Apple apple : inventory) {
            String output = p.accept(apple);
            System.out.println(output);
        }
    }
}
