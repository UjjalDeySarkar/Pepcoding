package com.ujjal;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void display(int[] args) {
        StringBuilder sb = new StringBuilder();

        for (int val : args) {
            sb.append(val + " ");
        }
        System.out.println(sb);
    }

    public static void swap(int[] arr, int left, int right){
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }

    public static void reverse(int[] a) {
        // write your code here
        int left = 0, right = a.length - 1;
        while (left<=right){
            swap(a,left,right);
            left++; right--;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }

        reverse(a);
        display(a);
    }

}
