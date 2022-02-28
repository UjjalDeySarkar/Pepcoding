package com.ujjal;

import java.util.Scanner;

public class Main {

    public static  void waveTraversal(int [][] mat){
        int n = mat.length; // to find rows length of matrix
        int m = mat[0].length;
        // Column by Column print
        for(int j=0; j<m; j++){
            if (j%2 == 0){
                for (int i=0; i<n; i++){
                    System.out.print(mat[i][j]);
                }
            }else {
                for (int i=n-1; i>=0; i--){
                    System.out.print(mat[i][j]);
                }
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] mat = new int[n][m];

        // Input row by row
        for (int i=0; i<n; i++){
            for (int j=0; j<m; j++){
                mat[i][j] = sc.nextInt();
            }
        }

        waveTraversal(mat);

    }
}
