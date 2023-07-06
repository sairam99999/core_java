package org.career.day3;

import java.util.Scanner;

public class BigOfTwo {
    public static void main(String... args)
    {
        System.out.println("give two numbers");
        System.out.println("enter first number");
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println("enter second number");
        int b=sc.nextInt();
        int big;
        if(a>b)
        {
            big=a;
        }
        else {
            big=b;
        }
        System.out.println("the biggest number of "+a+" and "+b+" is "+ big);
    }
}
