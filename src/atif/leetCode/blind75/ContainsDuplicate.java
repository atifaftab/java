package atif.leetCode.blind75;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] num = new int[]{2, 45, 36, 78, 2, 1, 9, 4};
        System.out.println(containsDuplicate(num));
    }

    //brute force
    private static boolean containsDuplicate(int[] num) {
        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] == num[j])
                    return true;
            }
        }
        return false;
    }

}
