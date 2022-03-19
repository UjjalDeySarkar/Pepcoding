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
        System.out.println( maxOfArr(arr,0));
    }

    public static int maxOfArr(int[] arr, int idx){
        if (idx ==arr.length) return Integer.MIN_VALUE;
        int maxtemp = maxOfArr(arr,idx+1);
        return Math.max(maxtemp,arr[idx]);
    }
}
