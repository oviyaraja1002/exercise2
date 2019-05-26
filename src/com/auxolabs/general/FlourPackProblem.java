package com.auxolabs.general;

public class FlourPackProblem
{
    public static void main(String[] args)
    {
        System.out.println(canPack(0,5,4));
    }
    public static boolean canPack(int bigCount,int smallCount, int goal)
    {
        if(bigCount>=0 && smallCount>=0 && goal>=0) {
            int ref = bigCount * 5;
            if (ref <= goal) {
                if (smallCount + ref >= goal) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }
}
