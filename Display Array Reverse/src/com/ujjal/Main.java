package com.ujjal;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        displayarr(arr,0);
    }

    public static void displayarr(int[]arr, int idx){
        if (idx== arr.length) return;
        displayarr(arr,idx+1);
        System.out.println(arr[idx]);
    }
}
