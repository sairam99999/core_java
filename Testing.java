package sairam;

import java.time.LocalDate;
import java.util.*;

public class Testing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int a = sc.nextInt();
        int value = isPrime(a);
System.out.println(value);
    }

    public static int isPrime(int val) {
        int num=val/2;
        if (val < 0 || (val % 2 == 0 && val != 2)) {
            System.out.println("is not prime");
        } else {
            System.out.println("is   prime");

        }
        return num;
    }

}
