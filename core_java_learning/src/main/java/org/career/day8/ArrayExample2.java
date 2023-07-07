package org.career.day8;

import java.util.Arrays;

public class ArrayExample2 {
    public static void main(String... args)
    {
        int[] arr1={1,2,3,4,5,6};
        int[] arr2={7,8,9,10,11,12};

        //if we print justt arr1 we will not ge the array it gives the
        // reference value which is in hexadecimal value [I@4dd8dc3
        System.out.println(arr1);

        //this one gives the array in normal way
        System.out.println(Arrays.toString(arr1));

    }
}
