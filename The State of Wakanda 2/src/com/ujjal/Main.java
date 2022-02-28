package com.ujjal;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        int m = sc.nextInt();

        int[][] mat = new int[n][n];

        // Input row by row
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                mat[i][j] = sc.nextInt();
            }
        }

        for(int gap=0; gap<mat[0].length; gap++){
            for (int i=0, j=gap ; j<mat[0].length ; i++, j++){
                System.out.println(mat[i][j]);
            }
        }
    }
}
