package com.auxolabs.general;

public class SharedDigit
{
    public static void main (String[] args)
    {
        System.out.println(hasSharedDigit(56,95));
    }
    public static boolean hasSharedDigit(int num, int num1)
    {
        boolean result = false;
        if ((num >= 10 && num <= 99) && (num1 >= 10 && num1 <= 99))
        {
            int a = num % 10;
            int b = num / 10;
            int c = num1 % 10;
            int d = num1 / 10;

            if (a == c || a == d || b == c || b == d)
            {
                result = true;
            }

        }
        return result;
    }
}
