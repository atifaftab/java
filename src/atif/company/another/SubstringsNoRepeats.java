package atif.company.another;

import java.util.HashSet;
import java.util.Set;

public class SubstringsNoRepeats {
    public static int countSubstringsNoRepeats(String s) {
        int n = s.length();
        Set<Character> seen = new HashSet<>();
        int count = 0;
        int left = 0;

        for (int right = 0; right < n; right++) {
            char currentChar = s.charAt(right);
            while (seen.contains(currentChar)) {
                seen.remove(s.charAt(left));
                left++;
            }
            seen.add(currentChar);
            count += right - left + 1;
        }

        return count;
    }

    public static void main(String[] args) {
        String s = "abac";
        System.out.println(countSubstringsNoRepeats(s));  // Output: 8
    }
}
