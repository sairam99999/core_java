package org.career.day9;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class DiceGame {
    public static void main(String[] args) {
        int generatenum = ThreadLocalRandom.current().nextInt(1, 7);
        System.out.println(generatenum);
        for (int i = 1; i <= 3; i++) {
        System.out.println("hey Guess one number from 1 to 6");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

            if (x == generatenum) {
                System.out.println("Congratulations you won at first guess");
                break;

            } else {
                System.out.println("wrong guess");
                if(i==3)
                {
                    System.out.println("you have exceede the attempts to play");
                }
            }

        }

    }
}
