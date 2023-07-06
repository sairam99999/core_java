package org.career.day6;

public class TeranaryOperator {
    public static void main(String... args)
    {
      int a=20;
      int b=30;
      int c=40;
      int result= biggest(20,30);
      System.out.println(result);
      int output=biggestThree(20,30,40);
      System.out.println(output);

    }

    private static int biggest(int x,int y)
    {
        int big= (x>y)? x:y;
        return big;
    }
    private static int biggestThree(int a, int b,int c)
    {
        int big=(a>b && a>c)? a:(b>c)? b:c;
        return big;
    }
}
