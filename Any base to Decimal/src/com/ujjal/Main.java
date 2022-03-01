package com.ujjal;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int d = getValueIndecimal(n, b);
        System.out.println(d);
    }

    public static int getValueIndecimal(int n, int b){
        int rv=0;
        int p=1;
        while (n>0){
            int dig = n%10;
            n= n/10;

            rv += dig*p;
            p*=b;
        }
        return rv;
    }
}