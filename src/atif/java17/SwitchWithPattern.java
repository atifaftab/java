package atif.java17;

public class SwitchWithPattern {
    public static void main(String[] args) {
        int day = 7;
        String message = switch (day) {
            case 1, 7 -> "Weekend";
            case 2, 3, 4, 5, 6 -> "Weekday";
            default -> "Invalid";
        };
        System.out.println("message = " + message);
    }
}
