package org.career.day10;

public class StringExample4 {
    public static void main(String[] args) {
        String data= "1001-sai-24,1002-ramya-22,1003-meghana-24,1004-ram-25";
        String[] empdata= data.split(",");
        System.out.println(empdata.length);
        for(String ele:empdata)
        {
            String[] arr=ele.split("-");
            System.out.println(arr[1]);
            System.out.println(arr[1].toUpperCase());


        }
    }
}
