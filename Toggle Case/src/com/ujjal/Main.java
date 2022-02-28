package com.ujjal;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        System.out.println(toggleCase(str));
    }

    public static String toggleCase(String str){
        String res="";
        for (int i=0; i<str.length(); i++){
            char ch=str.charAt(i);
            if (ch >= 'a' && ch <= 'z'){
                res += (char)(ch-32);
            }else {
                res += (char)(ch+32);
            }
        }
        return res;
    }
}
