package com.ujjal;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        for (int start=0; start<n; start++){

            for (int end=start; end<n; end++){
                for(int i=start; i<=end; i++){
                    System.out.print(arr[i]+"\t");
                }
                System.out.println();
            }
        }
    }
}
