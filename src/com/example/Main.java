package com.example;

import java.util.Scanner;

class ReverseString
{
    public static void main(String args[])
    {
        String original, reverse = "";
        Scanner in = new Scanner(System.in);

        System.out.println("Have a good day");
        original = in.nextLine();

        int length = original.length();

        for ( int i = length - 1 ; i >= 0 ; i-- )
            reverse = reverse + original.charAt(i);

        System.out.println("Reverse of entered string is: "+reverse);
    }
}

