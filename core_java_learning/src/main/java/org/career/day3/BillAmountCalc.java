package org.career.day3;

import java.util.Scanner;

public class BillAmountCalc{
    public static void main(String... args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the bill amount");
        int bill_amount=sc.nextInt();
        if(bill_amount>=5000)
        {
            float discount= (float)0.1* bill_amount;
            float total_amount= bill_amount-discount;
            System.out.println("the total amount after discount is "+total_amount);
            System.out.println("\n\nThank you for shopping with us");
        }
        else
        {
            float discount=(float)0.05*bill_amount;
            float total_amount= bill_amount-discount;
            System.out.println("the total amount after discount is "+total_amount);
            System.out.println("\n\nThank you for shopping with us");


        }



    }
}
