package com.auxolabs.general;

public class NumberofDaysInMonths
{
    public static void main(String [] args)
    {
        System.out.println(isLeapYear(2000));
    }
    public static boolean isLeapYear(int year)
    {
        if(year >=1 && year <=9999)
        {
            if(((year %4 ==0) && (year % 100 != 0)) || (year % 400 == 0) )
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        else
        {
            return false;
        }
    }
    public static void getDaysInMonth(int month, int year)
    {
        if (month == 2)
        {
            if (isLeapYear(year))
            {
                System.out.println("29 days ");
            }
            else
            {
                System.out.println("28 days ");
            }
        }
        else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
        {
            System.out.println("31 days");
        }
        else
        {
            System.out.println("30 days");
        }

    }
}
