package com.ujjal;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int d = scn.nextInt();
        int f = getDigitFrequency(n, d);
        System.out.println(f);

    }

    public static int getDigitFrequency(int n, int d) {
        // write code here
        int frequency=0;

        while(n>0){
            int dig=n%10;
            if (dig==d){
                frequency++;
            }
            n/=10;
        }

        return frequency;
    }

}
