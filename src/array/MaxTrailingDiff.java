package array;

public class MaxTrailingDiff {
    public static void main(String[] args) {
        int[] num = {9, 1, 86, 7, 343, 342, 5, 1};
        int n = num.length;
        int maxDiff = num[1] - num[0];

        //brute force
//        for (int i = 0; i < n; i++) {
//            for (int j = i + 1; j < n; j++) {
//                if (num[j] - num[i] > maxDiff) {
//                    maxDiff = num[j] - num[i];
//                }
//            }
//        }
//        System.out.println(maxDiff);


        //efficient way
        int min = num[0];
        for (int j : num) {
            if (j - min > maxDiff)
                maxDiff = j - min;
            if (j < min)
                min = j;
        }
        System.out.println(maxDiff);
    }


}
