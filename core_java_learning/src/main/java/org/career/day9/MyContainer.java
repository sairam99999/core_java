package org.career.day9;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class MyContainer {

    public static void main(String[] args)
    {
      int[] arr1=getRandomNumbers(10);
      System.out.println(Arrays.toString(arr1));
      int[] arr2=getRandomNumbers(5);
      System.out.println(Arrays.toString(arr2));

      //copy arr1 and arr2 in arr3

      int[] arr3=new int[arr1.length+arr2.length];
      System.arraycopy(arr1,0,arr3,0,arr1.length);
      System.out.println(Arrays.toString(arr3));
      System.arraycopy(arr2,0,arr3,arr1.length,arr2.length);
      System.out.println(Arrays.toString(arr3));





    }

    public static int[] getRandomNumbers(int n)
    {
        int[] temp=new int[n];
        for(int i=1;i<n;i++)
        {
            temp[i]= ThreadLocalRandom.current().nextInt(0,40);
        }
        return temp;
    }

}
