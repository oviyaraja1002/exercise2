package com.auxolabs.general;

public class LastDigitChecker
{
    public static void main(String[] args)
    {
        System.out.println(hasSameLastDigit(21,22,52));
        System.out.println(isValid(15));
    }
    public static boolean hasSameLastDigit(int a, int b, int c)
    {
        if((a>=10 && a<=1000)&&(b>=10 && b<=1000)&&(c>=10 && c<=1000)) {
            int num = a % 10;
            int num1 = b % 10;
            int num2 = c % 10;
            if (num == num1 || num == num2 || num1 == num2) {
                return true;
            }
        }
            return false;

    }
    public static boolean isValid(int number)
    {
        if(number >= 10 && number<= 1000 )
        {
            return true;
        }
        return false;
    }
}
