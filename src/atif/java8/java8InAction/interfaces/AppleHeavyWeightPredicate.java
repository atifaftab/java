package atif.java8.java8InAction.interfaces;

import atif.java8.java8InAction.Apple;

public class AppleHeavyWeightPredicate implements ApplePredicate {
    public boolean test(Apple apple) {
        return apple.getWeight() > 150;
    }
}
