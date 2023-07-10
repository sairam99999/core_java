package org.career.day14;

public class Methods {
    private /*static*/ String message="hi";

    public /*stactic*/ int sum(int a , int b)
    {
        return a+b;

    }
    public static void main(String[] args) {
        Methods obj=new Methods();
        System.out.println(obj.message);
        int res=obj.sum(5,6);
        System.out.println(res);
    }
}
// see the message variable gives compilation error becuase even
// variables inside the same class it gives error. the reason is
// the message variable is not a static and you are calling from static main.
//to solve this we need to create object in main method.