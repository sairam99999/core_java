package org.career.day15;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListExample2 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(10);
        numbers.add(54);
        numbers.add(78);
        numbers.add(45);
        numbers.add(65);
        numbers.add(12);
        numbers.add(55);
        System.out.println(numbers);
        numbers.set(1,340);
        System.out.println(numbers);

        System.out.println(numbers.get(1));
        //collections is one of the imp class which contains sort method to the elements.
        Collections.sort(numbers);
        System.out.println(numbers);
        for(int i:numbers)
        {
            System.out.print(i+" ");
        }

        // or
        System.out.println("");
        for(int i=0;i<numbers.size();i++)
        {
            System.out.print(numbers.get(i)+" ");
        }

    }
}
