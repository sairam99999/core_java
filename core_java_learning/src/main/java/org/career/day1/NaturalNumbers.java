package org.career.day1;

import java.util.Scanner;

public class NaturalNumbers {
    public static void main(String... args){
        System.out.println("Enter the N value:");
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int sum= n*(n+1)/2;
        System.out.println("the sum of "+n+" natural numbers is "+sum);

    }
}
