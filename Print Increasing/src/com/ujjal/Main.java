package com.ujjal;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        inc(n);
    }

    public static void inc(int n){
        if (n==0){
            return;
        }
        inc(n-1);
        System.out.println(n);
    }
}
