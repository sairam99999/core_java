package org.career.day4;

import java.util.Scanner;

// Write a program to accept the following details of an employee:
// empno, name and monthly salary; calculate the yearly salary and display the result.
public class EmployeeDetails {
    public static void main(String... args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the employee no");
        int empno=sc.nextInt();
        sc.nextLine();
        System.out.println("enter the employee name");
        String name=sc.nextLine();
        System.out.println("enter the employee monthly salary");
        int sal=sc.nextInt();
        int yr_sal;
        yr_sal=12*sal;
        System.out.println("the yearly salary of an employee is "+yr_sal);

    }
}
