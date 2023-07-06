package org.career.day6;

public class ExampleOnReturn {
   public static void main(String... args)
    {
        int n=10;
        int result=sumOfNaturalNumners(n);
        System.out.println(result);

    }
    public static int sumOfNaturalNumners(int n)
    {
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            sum =sum +i;
        }
        return sum;
    }
}
