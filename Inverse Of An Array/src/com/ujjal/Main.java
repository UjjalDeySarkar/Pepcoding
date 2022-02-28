package com.ujjal;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void display(int[] a){
        StringBuilder sb = new StringBuilder();

        for(int val: a){
            sb.append(val + "\n");
        }
        System.out.println(sb);
    }

    public static int[] inverse(int[] a){
        // write your code here
        int n= a.length;
        int[] b= new int[n];

        for (int i=0; i<n; i++){
            int j = a[i];
            b[j] = i;
        }
        return b;
    }

    public static void main(String[] args) throws Exception {
	// write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = Integer.parseInt(br.readLine());
        }

        int[] inv = inverse(a);
        display(inv);
    }
}
