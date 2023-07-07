package org.career.day8;

public class ElementInArray {
    public static void main(String... args)
    {
        int x=2;
        int[] array={1,22,32,6,4,2,2,45,65,76};
        int result=index(array,x);
        System.out.println("the index no is "+result);

    }

    public static int index(int[] arr,int ele)
    {
        for(int i=0;i< arr.length;i++)
        {
            if(arr[i]==ele)
            {
                return i;
            }
        }
        return -1;
    }
}
