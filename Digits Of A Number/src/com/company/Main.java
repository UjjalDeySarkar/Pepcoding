package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int rem,sum=0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while(n > 0){
            rem = n%10;
            sum = 10*sum+rem;
            n = n/10;
        }
        System.out.println(sum);
    }
}
