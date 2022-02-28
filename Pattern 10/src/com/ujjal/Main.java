package com.ujjal;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i=1; i<=(n/2)+1; i++ ){
            for (int j=1; j<=(n/2+1)-i; j++){
                System.out.print("\t");
            }
            System.out.print("*\t");
            for (int j=1; j<=2*(i-1)-1; j++){
                System.out.print("\t");
            }
            if (i!=1){
                System.out.print("*\t");
            }

            System.out.println();
        }
    }
}
