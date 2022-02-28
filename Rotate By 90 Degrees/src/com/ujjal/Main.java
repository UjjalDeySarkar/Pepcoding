package com.ujjal;

import java.util.Scanner;

public class Main {

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
        transpose(mat);
        swapColumn(mat);
        display(mat);
    }

    public static void swap(int[][] arr, int i, int j){
        int temp = arr[i][j];
        arr[i][j] = arr[j][i];
        arr[j][i] = temp;
    }

    public static void transpose(int[][] arr){
        for(int i=0; i< arr.length;i++){
            for (int j=i+1; j<arr[0].length; j++){
                swap(arr,i,j);
            }
        }
    }

    public static void swap(int[][] arr, int i, int leftCol, int rightColl){
        int temp = arr[i][leftCol];
        arr[i][leftCol] = arr[i][rightColl];
        arr[i][rightColl] = temp;
    }

    public static void swapColumn(int[][] arr){
        int leftCol=0, rightCol=arr[0].length-1;
        while (leftCol<rightCol){
            for (int i=0; i< arr.length;i++){
                swap(arr, i, leftCol, rightCol);
            }
            leftCol++; rightCol--;
        }
    }

    public static void display(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
