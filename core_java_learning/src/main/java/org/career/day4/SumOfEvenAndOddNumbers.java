package org.career.day4;

import java.util.Scanner;

public class SumOfEvenAndOddNumbers {
    public static void main(String... args){
        System.out.println("enter the lowerbound value");
        Scanner sc =new Scanner(System.in);
        int lb=sc.nextInt();
        System.out.println("enter the upperbound value");
        int ub=sc.nextInt();
        int evenSum=0;
        int oddSum=0;
        for(int i=lb;i<=ub;i++)
        {
            if(i%2==0)
            {
                evenSum=evenSum+i;

            }else {
                oddSum=oddSum+i;
            }

        }
        System.out.println("the sum of even and odd numbers betwen the given range "+lb+" and "+ub+" is "+evenSum +" "+oddSum);

    }
}
