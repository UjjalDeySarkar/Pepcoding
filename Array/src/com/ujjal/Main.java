package com.ujjal;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int n = sc.nextInt();

        int[] marks = new int[n];

        for(int i=0; i<n; i++){
            System.out.println("Enter Value of Index "+i);
            marks[i] = sc.nextInt();
        }

        System.out.println("Display");
        for(int i=0; i<n; i++){
            System.out.println("Index "+ i + " -> " +  marks[i]);
        }

    }
}
