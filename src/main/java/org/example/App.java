/**
 * UCF COP3330 Fall 2021 Assignment 9 Solution
 * Copyright 2021 Emily Radney
 */

package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        final int GALLONMAX = 350;
        int length, width, area, paint;
        Scanner scnr = new Scanner(System.in);

        System.out.print("What is the length of the ceiling? ");
        length = scnr.nextInt();
        System.out.print("What is the width of the ceiling? ");
        width = scnr.nextInt();

        area = length * width;
        paint = area / GALLONMAX;

        if ((area % GALLONMAX) != 0) {
            paint++;
        }

        System.out.println("You will need to buy " + paint + " gallons of paint to cover " + area + " square feet.");
    }
}
