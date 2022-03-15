package com.ujjal;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static  boolean isPrime(int x){
        for (int i=2; i*i<=x; i++){
            if (x%i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i=0; i<n; i++){
            arr.add(sc.nextInt());
        }

//        for (Integer val: arr){
//            System.out.print(val + " ");
//        }
//        System.out.println();

        //Solution
        for(int i=0; i< arr.size(); i++){
            if (isPrime(arr.get(i))){
                arr.remove(i);
                i--;
            }
        }

        System.out.println(arr);


    }
}
