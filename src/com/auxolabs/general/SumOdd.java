package com.auxolabs.general;

public class SumOdd
{
    public static void main(String[] args)
    {
        System.out.println(isOdd(5));
        System.out.println(sumOdd(13,13));
    }
    public static boolean isOdd(int number)
    {
        boolean check=false;
        if(number > 0)
        {
            if(number % 2 != 0)
            {
                check=true;
            }
        }
        return check ;

    }
    public static int sumOdd(int start, int end)
    {
        int sum = 0;
        if(end>=start&&start>0)
        {
            for (int i = start ;i <= end;i++) {
                if(isOdd(i))
                {
                    sum+=i;
                }
            }
        }else
        {
            sum = -1;
        }
        return sum;
    }
}
