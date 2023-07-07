package org.career.day8;

public class ArrayBasicExample {
    public static void main(String... args)
    {
        int[] arr=new int[5];
        arr[0]=1;
        arr[1]=32;
        arr[2]=21;
        arr[3]=56;
        arr[4]=65;

        //this is normal for loop used for particular conditions like retrieve only first
        // two or last two elements like that. in this case we cannot use for each loop
        for(int i=0;i< arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");
        System.out.println(arr.length);


       //these loop is called for each loop used to get every element from first to last
        for(int ele:arr)
        {
            System.out.print(ele+" ");
        }


    }
}
