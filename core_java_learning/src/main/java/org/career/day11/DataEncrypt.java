package org.career.day11;

import java.util.SortedMap;

public class DataEncrypt {
    public static void main(String[] args) {
        String data="sai,110260300,4000:kishore,104304206,-3000:ram,203104302,3200";
        sendAlert(data);



    }
    public static void sendAlert(String data)
    {
        // hello sai yor account ***********300 debited with amount

        String[] str=data.split(":");
        for( String transaction:str)
        {
            String[] arr=transaction.split(",");
            String name=arr[0];
            String acctnumber=arr[1];
            double amount=Double.parseDouble(arr[2]);
            String transactiontype=null;
            if(amount<0)
            {
                transactiontype="debited";

            }
            else{
                transactiontype="credited";
            }

            StringBuilder sb=new StringBuilder("hello ");
            sb.append(name+" your account ");
            sb.append(maskAccount(acctnumber));
            sb.append(" "+transactiontype);
            sb.append(" with ");
            sb.append(amount);
            System.out.println(sb);
            System.out.println("-".repeat(100));

        }

    }

    private static String maskAccount(String acctnumber)
    {
        return "**********"+acctnumber.substring(acctnumber.length()-3);
    }


}
