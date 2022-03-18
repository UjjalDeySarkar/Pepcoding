package com.ujjal;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int x= sc.nextInt();
        int n=sc.nextInt();
        System.out.println(power(x,n));
    }

    public static int power(int x, int n){
        if (n==0)
            return 1;
        int pow=power(x,n/2);
        if(n%2==1) return pow*pow*x;
        else return pow*pow;
    }
}
