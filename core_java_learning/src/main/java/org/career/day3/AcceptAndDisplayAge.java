package org.career.day3;

import java.util.Scanner;

public class AcceptAndDisplayAge {
    public static void main(String... args){
        System.out.println("enter the age:");
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();

        if(age<0)
        {
            age= -age;

        }
        System.out.println("Your given age is "+age);

    }
}
