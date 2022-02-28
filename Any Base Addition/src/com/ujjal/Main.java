package com.ujjal;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        int d = getSum(b, n1, n2);
        System.out.println(d);
    }

    public static int getSum(int b, int n1, int n2){
        // write ur code here
        int res=0;
        int multeplyer =1;
         int carry =0;

         while (carry>0 || n1 > 0 || n2 > 0){
             int d1 = n1%10;
             int d2 = n2%10;

              int temp = carry + d1 + d2;
              int qnt = temp/b;
              int rem = temp%b;

              res =res + (rem*multeplyer);
              carry=qnt;
              multeplyer *= 10;
              n1 /= 10;
              n2 /= 10;
         }
        return res;
    }
}
