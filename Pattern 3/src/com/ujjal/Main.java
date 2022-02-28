package com.ujjal;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i=1; i<=n; i++){
            for (int s=1; s<=n-i; s++){
                System.out.print("\t");
            }

            for (int st=1; st<=i; st++ ){
                System.out.print("*\t");
            }

            System.out.println();
        }
    }
}
