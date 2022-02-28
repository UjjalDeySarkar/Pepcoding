package com.ujjal;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        System.out.println(getValueInBase(n, b));
    }

    public static int getValueInBase(int n, int b){
        int res = 0;
        int p = 1;

        while (n>0){
            int dig = n%b;
            n=n/b;

            res += dig*p;
            p *= 10;
        }

        return res;
    }
}
