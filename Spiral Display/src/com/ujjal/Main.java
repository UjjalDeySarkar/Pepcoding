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

        int frow=0,fcol=0,lrow=n-1,lcol=m-1,count=0;

        while (count < n*m){
            for(int i=frow ;i<=lrow ;i++){
                System.out.println(mat[i][fcol]);
                count++;
                if (count == n*m){
                    return;
                }
            }
            fcol++;
            for (int j=fcol ;j<=lcol ;j++){
                System.out.println(mat[lrow][j]);
                count++;
                if (count == n*m){
                    return;
                }
            }
            lrow--;
            for (int i= lrow;i>= frow;i--){
                System.out.println(mat[i][lcol]);
                count++;
                if (count == n*m){
                    return;
                }
            }
            lcol--;
            for (int j=lcol ;j>=fcol ;j--){
                System.out.println(mat[frow][j]);
                count++;
                if (count == n*m){
                    return;
                }
            }
            frow++;
        }

    }
}
