package org.career.day11;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class DataEncrypt2 {
    public static void main(String[] args) {
        String data="sai,110260300,10000";
        // hello sai yor account ***********300 debited with amount
        sendAlert(data);
    }

    public static void sendAlert(String input)
    {
        String[] str= input.split(",");
        String name=str[0];
        String acctnum=str[1];
        String amount=str[2];
        System.out.println(name);
        System.out.println(acctnum);
        System.out.println(amount);
        String data=String.format("%s,%s,%s",name,acctnum,amount);
        System.out.println(data);

    }
}
