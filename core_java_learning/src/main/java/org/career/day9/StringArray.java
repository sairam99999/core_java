package org.career.day9;

import java.util.Arrays;

public class StringArray {
    public static void main(String[] args) {
        String[] str={"sai","meghana","vishnu","yogi"};
        System.out.println(Arrays.toString(str));
        String[] str1=new String[3];
        str1[0]="sai";
        str1[1]="meghana";
        str1[2]="samba";
        System.out.println(Arrays.toString(str1));

        for(String name:str)
        {
            System.out.print(name+" ");
        }
    }
}
