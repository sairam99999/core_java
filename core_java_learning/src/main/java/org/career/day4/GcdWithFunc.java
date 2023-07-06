package org.career.day4;

public class GcdWithFunc {
    public static void main(String... args) {
        int a = 40;
        int b = 24;
        int x=10;
        int result = gcd(a, b);
        MultiTable(x);

        System.out.println("the gcd of two numbers is " + result);

    }
    public static void MultiTable(int num)
    {
        for(int i=20;i>=1;i--)
        {
            System.out.println(num+ " * "+i+" = "+num*i);
        }
    }



    public static int gcd(int a, int b)
    {
        for(;a!=b;)
        {
            if (a > b) {
                a = a - b;
            } else
                b = b - a;
        }
        return a;

    }
}