package com.ujjal;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int inv = 0, op=1;
        while (n!=0){
            int od = n%10;

            int ip = od;
            int id = op;

            inv += id * (int)Math.pow(10,ip-1);

            n = n/10;
            op++;

        }
        System.out.println(inv);
    }
}
