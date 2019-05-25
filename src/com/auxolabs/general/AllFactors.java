package com.auxolabs.general;

public class AllFactors
{
    public static void main(String[] args)
    {
        printFactors(6);
    }
    public static int printFactors(int number)
    {
        if(number>1)
        {
            for(int i=1;i<=number;i++)
            {
                if(number%i==0)
                {
                    System.out.println(i);
                }
            }
        }
        return -1;

    }
}
