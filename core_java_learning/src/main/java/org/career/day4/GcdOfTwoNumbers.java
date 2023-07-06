package org.career.day4;

import java.util.Scanner;

public class GcdOfTwoNumbers {
    public static void main(String... args)
    {
        System.out.println("enter a value");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println("enter b value");
        int b=sc.nextInt();
        for(;a!=b;)
        {
            if (a > b)
            {
                a=a-b;
            }else
                b=b-a;
        }
        System.out.println("the gcd of two numbers is "+a);
    }
}
