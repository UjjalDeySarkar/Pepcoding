package com.ujjal;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] mat = new int[n][n];

        // Input row by row
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                mat[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<mat.length; i++){
            //finding minimum of ith row
            int minCol=0;
            for (int j=0; j<mat[0].length; j++){
                if(mat[i][j] < mat[i][minCol]){
                    minCol=j;
                }
            }
            int maxRow = 0;
            for (int k=0; k< mat.length; k++){
                if (mat[k][minCol] > mat[maxRow][minCol]){
                    maxRow=k;
                }
            }

            if(maxRow == i){
                System.out.println(mat[maxRow][minCol]);
                return;
            }

        }
        System.out.println("0 Saddle points");
    }
}
