package org.career.day11;

public class StringExample {
    public static void main(String[] args) {
        String name="sai";
        String comapany="TCS";
        int ag=24;
        double salary=24500;
        String email="sai@gmail.com";

        String data= String.format("%s,%s,%s,%s,%s",name,comapany,ag,salary,email);
        System.out.println(data);
        String str=new String(name);
        //System.out.println(str);
        str=str.concat(","+comapany);
        System.out.println(str);
    }
}
