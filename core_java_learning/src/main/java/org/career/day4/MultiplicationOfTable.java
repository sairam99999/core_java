package org.career.day4;

import java.util.Scanner;

public class MultiplicationOfTable {
    public static void main(String... args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the mutliplication table number");
        int num=sc.nextInt();
        for(int i=20;i>=1;i--)
        {
            System.out.println(num+ " * "+i+" = "+num*i);
        }
    }
}
