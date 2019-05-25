package com.auxolabs.general;

public class GreatestCommonDivisor
{
    public static void main(String[] args)
    {
        System.out.println(getGreatestCommonDivisor(20,40));
    }
    public static int getGreatestCommonDivisor(int first,int second)
    {
        int lastdiv = -1;
        if(first>10 && second >10)
        {
        int b = Math.max(first,second);
        for (int i=1;i<=b;i++)
        {
            if((first%i==0) && (second%i==0))
            {
               lastdiv = i;
            }
        }
        }
        return lastdiv;
    }
}
