package com.ujjal;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] mat = new int[n][m];
        for (int i=0; i<n; i++){
            for (int j=0; j<m; j++){
                mat[i][j]= sc.nextInt();
            }
        }

        int currRow=0,currCol=0, direction=0, prevRow=0,prevColm=0;
        //directions
        //right->0, down->1, left->2, top->3

        while ((currCol>=0) && (currRow>=0) && (currRow<n) && (currCol<m)){
            if (mat[currRow][currCol]==1){
                //Change Direction
                direction=(direction + 1)%4;
            }

            prevRow=currRow;
            prevColm=currCol;
            if (direction==0){
                //right
                currCol++;
            }else if (direction==1){
                //down
                currRow++;
            }else if (direction==2){
                //left
                currCol--;
            }else{
                //top
                currRow--;
            }
        }
        System.out.println(prevRow);
        System.out.println(prevColm);
    }
}
