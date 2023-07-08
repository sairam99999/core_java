package org.career.day10;

import java.util.Scanner;

public class StringExample2 {
    public static void main(String[] args) {
        String[] names=new String[]{"sai","meghana","yogi","vishnu","vyshnavi"};
        //String name="yogi";
        System.out.println("enter the name to find in string array");
        Scanner sc= new Scanner(System.in);
        String name= sc.nextLine();
        boolean x=isFound(names,name);
        System.out.println(x);

    }
    public static boolean isFound(String[] names,String name)
    {
        for(String ele:names)
        {
            if(ele.equals(name))
            {
                return true;
            }

        }
        return false;
    }
}
