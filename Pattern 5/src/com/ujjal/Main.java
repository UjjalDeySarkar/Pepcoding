package com.ujjal;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //Upper half
        int dec_counter=n/2;
        for (int i=1; i<=(n/2)+1; i++ ){

            for (int j=1; j<=dec_counter; j++){
                System.out.print("\t");
            }
            for (int j=1; j<=2*i-1; j++){
                System.out.print("*\t");

            }
            dec_counter--;
            System.out.println();
        }

        //Lower half
        int inc_count =1;
        for(int i=1; i<=n/2; i++){
            for (int j=1; j<=inc_count; j++){
                System.out.print("\t");
            }

            for (int j=1; j<=n-2*i; j++){
                System.out.print("*\t");
            }
            inc_count++;
            System.out.println();
        }

    }
}
