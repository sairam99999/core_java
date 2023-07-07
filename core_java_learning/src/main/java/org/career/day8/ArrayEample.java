package org.career.day8;

public class ArrayEample {
    public static void main(String... args)
    {
        int[] array={11,23,43,21,54,1,65,76,64,78,32,98};
        int result=biggestOfArray(array);
        System.out.println("the biigest number in array is "+result);
        int result1=smallestOfArray(array);
        System.out.println("the smallest number in the array is "+result1);
    }

    public static int biggestOfArray(int[] arr)
    {
        int big=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>big)
            {
                big=arr[i];

            }
        }
        return big;
    }

    public static int smallestOfArray(int[] arr)
    {
        int small=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]<small)
            {
                small=arr[i];
            }
        }
        return small;
    }
}
