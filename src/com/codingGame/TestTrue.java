package com.codingGame;
// a return true if one of argument is 1 or sum of both argument is 1

public class TestTrue {
    public static void main(String[] args) {

        System.out.println(a(-3,4));
    }

    static boolean a(int i, int j){
        if(i ==1 || j == 1) return true;
        if( i + j == 1) return true;
        return false;
    }
}
