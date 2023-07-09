package org.career.day11;

public class StringBufferExample {
    public static void main(String[] args) {
        stringbuffer(new String[]{"sai","ramya","kishore"},"javaFullStack");
        stringbuffer1(new String[]{"yogi","vishnu","ram"},"oracle");
    }

    public  static void stringbuffer(String[] users, String Programname)
    {
        for(String username:users)
        {
            StringBuilder str=new StringBuilder(" <!DOCTYPE html>");
            str.append("\n<html lang=\"en\">");
            str.append("\n\t<head>");
            str.append("\n\t\t<title>Document</title>");
            str.append("\n\t</head>");
            str.append("\n\t<body>");
            str.append(String.format("\n\t\t<h3>hello %s</h3>",username));
            str.append("\n\t</p>");
            str.append(String.format("\n\t\twelcome to %s",Programname));
            str.append("\n\t</p>");
            str.append("\n\t</body>");
            str.append("\n</html>");
            System.out.println(str);
            System.out.println("*".repeat(100));
        }
    }

// the difference between these two is Stringbuilder create just one object
// and make modifications to that object when we try append
  //but in String if we do string concat every it creates new objects and destroy the old ones.
// so it is no reliable in real times.
    public  static void stringbuffer1(String[] users, String Programname)
    {
        for(String username:users)
        {
            String str=new String(" <!DOCTYPE html>");
            str=str.concat("<head>");
            str=str.concat("<title>Document</title>");
            str=str.concat("</head>");
            str=str.concat("<body>");
            str=str.concat(String.format("<h3>hello %s</h3>",username));
            str=str.concat("<p>");
            str=str.concat(String.format("welcome to %s",Programname));
            str=str.concat(" </p>");
            str=str.concat("</body>");
            str=str.concat("</html>");
            System.out.println(str=str);
            System.out.println("*".repeat(100));
        }
    }
}
