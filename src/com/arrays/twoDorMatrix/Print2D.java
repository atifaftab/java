package com.arrays.twoDorMatrix;

public class Print2D {
    //multi dimentional array
    public static void main(String[] args) {
        int mat[][] = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}};

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
        }
        System.out.println("--------");
        //using foreach
        for (int[] i : mat) {
            for (int j : i) {
                System.out.print(j + " ");
            }
        }
    }
}
