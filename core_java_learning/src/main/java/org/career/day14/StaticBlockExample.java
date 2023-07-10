package org.career.day14;

class StaticBlock{

    static {
        System.out.println("hi sai");
    }
    public static int sum(){
        return 30;
    }
    static {
        System.out.println("hi meghana");
    }
    static {
        System.out.println("hi shreya");
    }
}

public class StaticBlockExample {
    public static void main(String[] args) {
        System.out.println(StaticBlock.sum());

    }
}
