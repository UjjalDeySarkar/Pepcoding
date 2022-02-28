package com.ujjal;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int div=2; div*div<=n; div++){
            while (n % div == 0){
                n = n/div;
                System.out.println(div);
            }
        }

        if (n!=1){
            System.out.println(n);
        }
    }
}
