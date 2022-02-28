package com.ujjal;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i<n; i++){
            arr[i] = sc.nextInt();

        }
        int find = sc.nextInt();

        System.out.println(findElement(arr, find));

    }

    public static int findElement(int[] a, int find){
        for (int i=0; i<a.length; i++){
            if (a[i] == find){
                return i;
            }
        }
        return -1;
    }
}
