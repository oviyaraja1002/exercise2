package com.auxolabs.general;

public class LargestPrime
{
    public static void main(String[] args)
    {
        System.out.println(isPrime(10));
        System.out.println(getLargestPrime(21));
    }
    public static boolean isPrime(int number)
    {
        if (number > 0)
        {
            for (int i = 2; i <= number / 2; i++)
            {
                if (number % i == 0)
                {
                    return false;
                }
            }
            return true;

        }
        return false;
    }
    public static int getLargestPrime(int number)
    {
        for (int i = number - 1; i >= 1; i--)
        {
            if ((number % i == 0) && isPrime(i))
            {
                return i;
            }
        }
        return -1;
    }

    }

