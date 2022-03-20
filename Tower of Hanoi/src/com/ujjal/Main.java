package com.ujjal;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int src= sc.nextInt();
        int dest= sc.nextInt();
        int aux= sc.nextInt();
        toh(n,src,dest,aux);
    }

    public static void toh(int n, int srcTower, int destTower, int auxTower){
        if (n==0)return;
        toh(n-1,srcTower,auxTower,destTower);
        System.out.println(n+"["+srcTower+"->"+destTower+"]");
        toh(n-1,auxTower,destTower,srcTower);
    }
}
