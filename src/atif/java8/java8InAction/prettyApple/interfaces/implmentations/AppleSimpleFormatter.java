package atif.java8.java8InAction.prettyApple.interfaces.implmentations;

import atif.java8.java8InAction.Apple;
import atif.java8.java8InAction.prettyApple.interfaces.AppleFormatter;

public class AppleSimpleFormatter implements AppleFormatter {
    public String accept(Apple apple) {
        return "An apple of " + apple.getWeight() + " g";
    }
}
