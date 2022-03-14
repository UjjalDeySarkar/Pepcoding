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

        //Update
        arr.set(3,100);

        //traversal
        for(int i=0; i<n; i++){
            System.out.print(arr.get(i) + " ");
        }

        //remove
        arr.remove(2);
        System.out.println();

        //traversal
        for(int i=0; i<arr.size(); i++){
            System.out.print(arr.get(i) + " ");
        }
        System.out.println(arr);

//        int[] arr ={10,20,30,40,50};
//        //foreach
//        for (int val : arr){
//            System.out.print(val + " ");
//        }

        for (Integer val: arr){
            System.out.print(val + " ");
        }


    }
}
