package array;

public class MaxTrailingDiff {
    public static void main(String[] args) {
        int[] num = {9, 1, 86, 7, 343,342, 5, 1};
        int n = num.length;
        int min = num[1] - num[0];
//        int maxDiff = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (num[j] - num[i] > min) {
                    min = num[j] - num[i];
                }
            }
        }
        System.out.println(min);
    }

//    for(int i=0; i<n)
}
