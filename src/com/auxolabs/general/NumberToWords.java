package com.auxolabs.general;

public class NumberToWords
{
    public static void main(String[] args)
    {
        System.out.println(getDigitCount(123));
        System.out.println(Reverse(123));
    }
    public static int getDigitCount(int number)
    {
        int digit,count=0;
        while(number>0)
        {
            digit = number % 10;
            number= number/ 10;
            count++;
        }
        return count;
    }
    public static int Reverse(int number)
    {
        int digit;
        int reverse=0;
        while(number>0) {
            digit = number % 10;
            reverse=(reverse*10)+digit;
            number = number/ 10;
        }
        numbersToWords(reverse);
        return reverse;
    }
    public static void numbersToWords(int reverse)
    {
        int digit;
        int sum=0;
        while(reverse>0)
        {
            digit = reverse % 10;
            System.out.println(numInWords(digit));
            sum=(sum*10)+digit;
            reverse = reverse/10;
        }
    }
    public static String numInWords(int number)
    {
        switch (number)
        {
            case 0:
                return "ZERO";
            case 1:
                return "ONE";
            case 2:
                return "TWO";
            case 3:
                return "THREE";
            case 4:
                return "FOUR";
            case 5:
                return "FIVE";
            case 6:
                return "SIX";
            case 7:
                return "SEVEN";
            case 8:
                return "EIGHT";
            case 9:
                return"NINE";
            default:
                return "INVALID VALUE";
        }

    }
}