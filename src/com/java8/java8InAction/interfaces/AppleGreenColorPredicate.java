package com.java8.java8InAction.interfaces;

import com.java8.java8InAction.Apple;

public class AppleGreenColorPredicate implements ApplePredicate {
    public boolean test(Apple apple) {
        return "Green".equals(apple.getColor());
    }
}
