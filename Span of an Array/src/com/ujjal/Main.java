package com.ujjal;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Length of array: ");
        int n = sc.nextInt();

        int[] val = new int[n];

        for (int i = 0; i<n; i++){
            val[i] = sc.nextInt();
        }

        for (int i = 0; i<n; i++){
            if (val[i] > max)
                max=val[i];
            if (val[i] < min)
                min=val[i];

        }
        System.out.println("min value is: "+ min + "\nMax Value is: "+ max);

        int span = max - min;
        System.out.println("Span value is: "+ span);

    }
}
