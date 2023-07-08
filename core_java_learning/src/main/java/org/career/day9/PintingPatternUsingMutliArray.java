package org.career.day9;

public class PintingPatternUsingMutliArray {
    public static void main(String[] args) {
    printPattern();
    printPattern1();
    printPattern2();
    }


    public static void printPattern(){
        int[][] arr= new int[][]{
                {1,1,0,0,0,0,0,1,1},
                {1,0,1,0,0,0,1,0,1},
                {1,0,0,1,0,1,0,0,1},
                {1,0,0,0,1,0,0,0,1},
                {1,0,0,0,0,0,0,0,1}
        };
        for(int i=0;i< arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                if(arr[i][j]==1)
                {
                    System.out.print("\u001B[35m"+"M");
                }
                else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }


     }

    public static void printPattern1(){
        int[][] arr= new int[][]{
                {0,0,1,1,0,0,0,1,1,0,0},
                {0,1,0,0,1,0,1,0,0,1,0},
                {1,0,0,0,0,1,0,0,0,0,1},
                {0,1,0,0,0,0,0,0,0,1,0},
                {0,0,1,0,0,0,0,0,1,0,0},
                {0,0,0,1,0,0,0,1,0,0,0},
                {0,0,0,0,0,1,0,0,0,0,0}
        };
        for(int i=0;i< arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                if(arr[i][j]==1)
                {
                    System.out.print("\u001B[31m"+".");
                }
                else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }


    }
    public static void printPattern2(){
        int[][] arr= new int[][]{
                {1,1,1,1,1,1,1,1,1},
                {1,0,0,0,0,0,0,0,0},
                {1,0,0,0,0,0,0,0,0},
                {1,1,1,1,1,1,1,1,1},
                {0,0,0,0,0,0,0,0,1},
                {0,0,0,0,0,0,0,0,1},
                {1,1,1,1,1,1,1,1,1}
        };
        for(int i=0;i< arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                if(arr[i][j]==1)
                {
                    System.out.print("\u001B[34m"+"s");
                }
                else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }


    }
}
