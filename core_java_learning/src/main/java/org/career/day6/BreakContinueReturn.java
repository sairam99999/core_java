package org.career.day6;

public class BreakContinueReturn {
    public static void main(String... args)
    {
     int[] arr={1,2,3,4,5,6,7};
     int[] array={1,2,0,1,1,4,6,1,0,1,5};
     int a=6;
     int result=index(arr,a);
     System.out.println(result);
     printAllNonbinaryNumbers(array);

    }
    private static int index(int[] arr,int ele)
    {
        int index=-1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==ele)
            {
                index=i;
                break;
            }

        }
        return index;
    }

    public static void printAllNonbinaryNumbers(int[] arr)
    {
        for(int i=0;i< arr.length;i++)
        {
            if(arr[i]==0 || arr[i]==1)
            {
               continue;
            }
            System.out.println(arr[i]);
        }
    }
}
