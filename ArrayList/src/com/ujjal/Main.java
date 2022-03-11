package com.ujjal;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();

        //Input
        for(int i=0; i<n; i++){
            Integer x = sc.nextInt();
            arr.add(x);
        }

        //traversal
        for(int i=0; i<n; i++){
            System.out.print(arr.get(i) + " ");
        }
    }
}
