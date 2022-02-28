package com.ujjal;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int col = sc.nextInt();

        int[][] mat = new int[rows][col];
        for (int i=0; i<rows; i++){
            for (int j=0; j<col; j++){
                mat[i][j]= sc.nextInt();
            }
        }

        for (int i=0; i<rows; i++){
            for (int j=0; j<col; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
