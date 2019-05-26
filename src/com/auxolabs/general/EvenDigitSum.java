package com.auxolabs.general;

import java.util.Scanner;

public class EvenDigitSum
{

    public static void main(String[] args)
    {
        getEvenDigitSum(245678);
    }

    public static void getEvenDigitSum(int number)
    {
        int sum = 0;
        if (number < 0)
        {
            System.out.println(-1);
        }
        else
            {
            while (number > 0)
            {
                int temp = number % 10;
                if (temp% 2 == 0)
                {
                    sum = sum + temp;
                }
                number = number / 10;

            }
            System.out.println(+sum);
        }
    }
}
