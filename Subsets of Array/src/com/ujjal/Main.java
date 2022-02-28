package com.ujjal;

import java.util.Scanner;

public class Main {

    public static int decimalToBinary(int decimal){
        int res =0;
        int mult = 1;
        while (decimal>0){
            int div = decimal/2;
            int rem = decimal%2;

            decimal=div;
            res=res+rem*mult;
            mult *= 10;

        }
        return res;
    }
    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        int total_subset= (int)Math.pow(2,n);

        for (int dec=0; dec<total_subset; dec++){
            int binaryNo = decimalToBinary(dec);
//            System.out.println(binaryNo);

            int power = (int) Math.pow(10,n-1);
            //convert binaryNo to equivalent subset
            for (int i=0; i<n; i++ ){
                int bit = (binaryNo/power) % 10;
                if (bit == 1){
                    System.out.print(arr[i] + "\t");
                }else {
                    System.out.print("-\t");
                }

                power /= 10;
            }
            System.out.println();
        }
    }
}
