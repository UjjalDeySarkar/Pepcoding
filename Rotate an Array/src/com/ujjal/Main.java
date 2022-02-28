package com.ujjal;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void display(int[] a){
        StringBuilder sb = new StringBuilder();

        for(int val: a){
            sb.append(val + " ");
        }
        System.out.println(sb);
    }


    public static void reverse(int[] a, int left, int right) {
        // write your code here
        while (left<=right){
            swap(a,left,right);
            left++; right--;
        }
    }

    public static void swap(int[] arr, int left, int right){
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }

    public static void rotate(int[] a, int k){
        // write your code here
        int n = a.length;

        //Handel Larger values of k
        k = k%n;

        if (k<0){
            k=k+n;
        }

        //Reverse first block
        reverse(a, 0, n-k-1);

        //Reverse Second block
        reverse(a,n-k,n-1);

        //Reverse Entire array
        reverse(a,0,n-1);
    }
    public static void main(String[] args) throws Exception {
	// write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = Integer.parseInt(br.readLine());
        }
        int k = Integer.parseInt(br.readLine());

        rotate(a, k);
        display(a);
    }
}
