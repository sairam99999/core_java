package org.career.day3;

import java.util.Scanner;

public class Grade {
    public static void main(String... args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the marks [1-10]");
        int score=sc.nextInt();
        if(score>=9&&score<=10)
        {
            System.out.println("score "+score+ " is \"A\" Grade");
        } else if (score>=7&&score<=8) {
            System.out.println("score "+score+ " is \"B\" Grade");
        } else if (score>=5&&score<=6) {
            System.out.println("score "+score+ " is \"C\" Grade");
        }else if(score>=0&&score<=4) {
            System.out.println("score " + score + " is \"D\" that is equals to fail");
        }
        else
        {
            System.out.println("you have entered the wrong score");
        }
    }
}
