package org.career.day11;

public class RecursionExample {
    public static void main(String[] args)
    {
        System.out.println(fact(5));
    }

    public static int fact(int num)
    {
        if(num==0 || num==1)
        {
            return 1;
        }
        return num*fact(num-1);
    }
}

