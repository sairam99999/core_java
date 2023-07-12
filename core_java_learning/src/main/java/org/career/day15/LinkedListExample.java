package org.career.day15;

//in linkedlist elements are stored in containers whereas as in arraylist
// it stored in array.


import java.util.Collections;
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<String>();
        cars.add("benz");
        cars.add("tesla");
        cars.add("bmw");
        cars.add("toyato");
        cars.add("hyundai");
        cars.add("honda");
        cars.add("ford");
        cars.add("cheve");
        System.out.println(cars);
        System.out.println(cars.get(2));
        //addfirst() ,adddlast(), removefisrt(), removelast(),getfirst(),getlast()
        //these are used in linked list that differ from arraylist rest eberything is same.
        cars.addFirst("jaguar");
        System.out.println(cars);
        for(String str:cars)
        {
            System.out.println(str);

        }
        Collections.sort(cars);
        System.out.println("*".repeat(100));
        for(String str:cars)
        {
            System.out.println(str);

        }
    }
}
