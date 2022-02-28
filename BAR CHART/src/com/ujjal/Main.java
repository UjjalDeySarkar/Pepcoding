package com.ujjal;

import java.util.Scanner;

public class Main {

    public static int maxVal(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int i=0; i<arr.length; i++){
//            if (arr[i] > max)
//                max=arr[i];
            max = Math.max(arr[i], max);
        }

        return max;
    }

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        int totcoll=n;
        int totrow=maxVal(arr);

        for (int i=totrow - 1; i>=0; i--){

            for (int j=0; j<totcoll; j++){
                if (i<arr[j]){
                    System.out.print("*\t");
                }else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }

    }
}
