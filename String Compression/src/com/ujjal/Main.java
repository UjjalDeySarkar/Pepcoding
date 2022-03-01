package com.ujjal;

import java.util.Scanner;

public class Main {

    public static String compression1(String input){
        String output="";

        for (int idx=0; idx<input.length(); idx++){
            // is character first element of it's group
            if (idx==0 || input.charAt(idx) != input.charAt(idx-1)){
                output += input.charAt(idx);
            }
        }

        return output;
    }

    public static String compression2(String str){

        return null;
    }

    public static void main(String[] args) {
	// write your code here
        Scanner scn = new Scanner(System.in);
        String s = scn.next();

        System.out.println(compression1(s));
//        System.out.println(compression2(s));
    }
}
