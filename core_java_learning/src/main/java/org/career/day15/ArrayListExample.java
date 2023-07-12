package org.career.day15;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> brands=new ArrayList<String>();
        //add()  method used to add elements to array
        brands.add("tommyHF");
        brands.add("hollister");
        brands.add("gap");
        brands.add("nautica");
        brands.add("undera armour");
        System.out.println(brands);
        brands.add("nike");
        System.out.println(brands);
        //get() method is used to get the value or elements from arraylist using index number.
        System.out.println(brands.get(1));
        //set() method is used to set value to arraylist.
        brands.set(5,"dream house");
        System.out.println(brands);
        //remove is used to remove an element.
        brands.remove(4);
        System.out.println(brands);
        //size() is used to get the length of arraylist.
        System.out.println(brands.size());
        // clear() is used to clear all the elements from the arraylist.
        brands.clear();
        System.out.println(brands);



    }
}
