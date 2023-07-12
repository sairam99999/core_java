package org.career.day15;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ArrayListExample3 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<String>();
        names.add("sai");
        names.add("meghana");
        names.add("yogi");
        names.add("vishnu");
        names.add("ramya");
        names.add("shreya");
        System.out.println(names);

        for (String ele : names) {
            System.out.print(ele+" ");
        }
        System.out.println("");
        System.out.println("*".repeat(50));
        ListIterator<String> listIterator = names.listIterator();
        while (listIterator.hasNext()) {
            System.out.print(listIterator.next()+" ");
        }
        System.out.println("");
        System.out.println("*".repeat(50));
        while(listIterator.hasNext())
        {
           String str= listIterator.next();
            System.out.println(str);

        }

    }
}