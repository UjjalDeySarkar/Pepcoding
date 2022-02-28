package com.ujjal;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        int d = getDifference(b, n1, n2);
        System.out.println(d);
    }
    // n2 > n1 -> n2 is always greater then n1
    public static int getDifference(int b, int n1, int n2){
        // write your code here
        int res = 0;
        int multiplier = 1;
        int borrow = 0;

        while (n2 > 0){
            int d1 = n1 % 10;
            int d2 = n2 % 10;
            int temp = d2 - d1 + borrow;

            if (temp<0){
                res = res + (temp+b) * multiplier;
                borrow= -1;

            } else {
                res = res + (temp * multiplier) ;
                borrow= 0;
            }
            multiplier *= 10;
            n1 /= 10;
            n2 /= 10;

        }
        return res;
    }
}
