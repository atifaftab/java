package atif.leetCode.blind75;

/*You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.
        Return the merged string.
        Example 1:
        Input: word1 = "abc", word2 = "pqr"
        Output: "apbqcr"*/
public class MergeStringAlternately {
    public static void main(String[] args) {
        String word1 = "abc";
        String word2 = "pqrst";
        mergeAlternatively(word1, word2);
        System.out.println("===== 2nd method ======");
        mergeAlternatively1(word1, word2);
    }

    private static void mergeAlternatively(String word1, String word2) {
        String mergedString = "";
        int biggerLength = word1.length() > word2.length() ? word1.length() : word2.length();
        for (int i = 0; i < biggerLength; i++) {
            if (i < word1.length())
                mergedString += word1.charAt(i);
            if (i < word2.length())
                mergedString += word2.charAt(i);
        }
        System.out.println(mergedString);
    }

    //better method
    private static void mergeAlternatively1(String word1, String word2) {
        StringBuilder mergedString = new StringBuilder();
        int i = 0;
        while ((i < word1.length()) || (i < word2.length())) {
            if (i < word1.length())
                mergedString.append(word1.charAt(i));
            if (i < word2.length())
                mergedString.append(word2.charAt(i));
            i++;
        }
        System.out.println(mergedString);
    }
}