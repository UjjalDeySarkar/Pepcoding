package com.ujjal;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sourceBase = scn.nextInt();
        int  destBase = scn.nextInt();
        System.out.println(getValue(n,sourceBase,destBase));
    }

    public static int getValue(int n, int b1, int b2){
        int dec = anyToDecimal(n,b1);
        int dn = decimalToAny(dec,b2);
        return dn;
    }

    public static int decimalToAny(int n, int b){
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

    public static int anyToDecimal(int n, int b){
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
