package org.career.day14;
import static java.lang.Math.*;
final class MyMath{

    private MyMath()
    {

    }
    public static int sum(int a,int b)
    {
        return a+b;
    }
    public static int mul(int a, int b)
    {
        return  a*b;
    }

}

public class MyMathManager {
    public static void main(String[] args) {
        int x=MyMath.sum(5,6);
        int y=MyMath.mul(5,5);
        System.out.println(x+" "+y);
        System.out.println(sqrt(16));//we can write like this by importing all math functions
        System.out.println(Math.sqrt(25));



    }
}
