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
        int target = sc.nextInt();
        System.out.println(lastIndex(arr,arr.length-1, target));
    }

    public static int lastIndex(int[] arr, int idx,int x){
        if (idx == -1) return -1;

        if (arr[idx] == x){
            return idx;
        }else {
            return lastIndex(arr,idx-1,x);
        }
    }
}
