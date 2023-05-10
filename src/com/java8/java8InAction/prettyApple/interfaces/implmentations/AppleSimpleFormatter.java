package com.java8.java8InAction.prettyApple.interfaces.implmentations;

import com.java8.java8InAction.Apple;
import com.java8.java8InAction.prettyApple.interfaces.AppleFormatter;

public class AppleSimpleFormatter implements AppleFormatter {
    public String accept(Apple apple) {
        return "An apple of " + apple.getWeight() + " g";
    }
}
