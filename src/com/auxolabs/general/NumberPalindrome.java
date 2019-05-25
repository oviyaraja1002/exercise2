package com.auxolabs.general;

public class NumberPalindrome
{
    public static void main(String[] args)
    {
        System.out.println(isPalindrome(121));
    }
    public static boolean isPalindrome(int number)
    {
        int temp = number;
        int rev = 0;
        while (number>0)
        {
            int rem = number%10;
            rev = rev*10+rem;
            number = number/10;
        }
        if(temp == rev)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
