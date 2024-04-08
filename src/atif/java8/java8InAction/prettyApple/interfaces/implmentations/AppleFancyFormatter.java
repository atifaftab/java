package atif.java8.java8InAction.prettyApple.interfaces.implmentations;

import atif.java8.java8InAction.Apple;
import atif.java8.java8InAction.prettyApple.interfaces.AppleFormatter;

public class AppleFancyFormatter implements AppleFormatter {
    public String accept(Apple apple) {
        String characteristics = apple.getWeight() > 150 ? "heavy" : "light";
        return "A " + characteristics + " " +apple.getColor() + " apple";
    }
}
