package org.career.day10;

public class PalindromeString {
    public static void main(String[] args) {
        String name="radar";
        System.out.println(isPalindrome(name));
    }
    public static boolean isPalindrome(String data)
    {
        for(int i=0,j=data.length()-1;i<=j;i++,j--)
        {
            if(data.charAt(i)!=data.charAt(j))
            {
                return false;
            }
        }
        return true;

    }
}
