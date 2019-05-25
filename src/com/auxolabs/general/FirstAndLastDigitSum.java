package com.auxolabs.general;

public class FirstAndLastDigitSum {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(1234));
    }

    public static int sumFirstAndLastDigit(int num)
    {
        if(num > 0) {
            int a = num % 10;
            int rev = 0;
            while (num > 0) {
                int rem = num % 10;
                rev = rev * 10 + rem;
                num = num / 10;
            }
            int b = rev % 10;
            int c = a + b;
            return c;
        }
        else
            {
                return -1;
            }
    }
}
