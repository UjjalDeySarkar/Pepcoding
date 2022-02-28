package com.ujjal;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int n = 1221;
        int temp=n;
        int r,sum=0;
        while(n>0){
            r= n%10;
            sum=(sum*10) +r;
            n=n/10;
        }

        if(temp == sum){
            System.out.println("No is Palindrom");
        }else{
            System.out.println("No is not Palindrom");
        }
    }
}
