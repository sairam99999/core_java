package org.career.day11;

public class OccurenceOfWord {
    public static void main(String[] args) {
        String data = """
                Lorem Ipsum is simply dummy text of the printing and typesetting industry. 
                Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, 
                when an unknown simply took a galley of type and scrambled it to simply type specimen book. 
                It has simply not only five simply, but also the leap into electronic typesetting, r
                emaining essentially unchanged. It was popularised in the 1960s with the release of Letraset
                sheets containing Lorem Ipsum simply, and more recently with desktop publishing 
                software like Aldus PageMaker including versions of Lorem Ipsum.
                """;

         data=data.replaceAll(",","").replaceAll("\\.","").replaceAll("\\n","");
        String[] arr=data.split(" ");
        int result= occurance(arr,"simply");
        System.out.println(result);
    }

    public static int occurance(String[] words,String word)
    {
        int count=0;
        for(String ele:words)
        {
            if(ele.equals(word))
            {
                count++;
            }
        }
        return count;
    }
}
