package atif.dsa.stack.leetcode;

public class ReverseString {
    public static void main(String[] args) {
        String myString = "";
        String reversedString = reverseString(myString);
        System.out.println(reversedString);
    }

    public static String reverseString(String myString) {
        String reverString = "";
        Stack<Character> stack = new Stack<>();
        for (char c : myString.toCharArray()) {
            stack.push(c);
        }
        while (!stack.isEmpty()) {
            reverString += stack.pop();
        }
        return reverString;
    }
}
