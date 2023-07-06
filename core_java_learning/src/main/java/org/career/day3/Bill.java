package org.career.day3;

import java.util.Scanner;

public class Bill{
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.nextLine();

        System.out.println("Enter the bill amount:");
        int bill_amount;

        try {
            bill_amount = sc.nextInt();
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid integer.");
            return; // Exit the program
        }

        if (bill_amount >= 5000) {
            float discount = 0.1f * bill_amount;
            float total_amount = bill_amount - discount;
            System.out.println("Dear " + name);
            System.out.println("The total amount after discount is " + total_amount);
        } else {
            System.out.println("The total amount is " + bill_amount);
        }
    }
}
