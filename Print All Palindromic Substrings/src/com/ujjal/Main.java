package com.ujjal;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        solution(str);
    }

    public static void solution(String str){
        for (int i=0; i<str.length(); i++){
            for (int j=i; j<str.length(); j++){
//                System.out.println("Char -> "+str.charAt(j));
                String subStr = str.substring(i,j+1);
//                System.out.println("subStr -> "+subStr);
                if (isPalindrome(subStr)){
                    System.out.println(subStr);
                }
            }

        }
    }

    public static boolean isPalindrome(String str){
        int left = 0, right = str.length()-1;
        while (left<right){
            if (str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++; right--;
        }
        return true;
    }
}
