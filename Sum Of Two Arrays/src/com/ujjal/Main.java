package com.ujjal;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();

        int[] arr1 = new int[n1];
        for (int i=0; i<n1; i++){
            arr1[i]=sc.nextInt();
        }

        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        for (int i=0; i<n2; i++){
            arr2[i]=sc.nextInt();
        }

        int carry = 0;
        int[] res = new int[Math.max(n1,n2)+1];
        int i1 = n1-1, i2 = n2-1, i3= res.length-1;

        while (i3 >= 0){
            //Negative Index -> Index out of bond
            int d1 = (i1 >= 0) ? arr1[i1] : 0;
            int d2 = (i2 >= 0) ? arr2[i2] : 0;

            int temp = d1+d2+carry;
            int qunt = temp/10;
            int rem = temp%10;
            carry=qunt;
            res[i3]=rem;
            i1--; i2--; i3--;
        }

        // leading zeros are being skipped
        int indx=0;
        while (res[indx] == 0){
            indx++;
        }
        for (int i=indx; i< res.length; i++){
            System.out.println(res[i]);
        }

    }
}
