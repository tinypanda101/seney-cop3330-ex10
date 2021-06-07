/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Ryan Seney
 */

import java.util.Scanner;


public class PaintCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // get length and width
        System.out.println("What is the length in feet?");
        int length = scanner.nextInt();

        System.out.println("What is the width in feet?");
        int width = scanner.nextInt();

        // find total square feet
        int squareFeet = length * width;

        // one gallon covers 350 feet use a constant
        final double conversion = 350.0;

        // do math and round up
        int amountOfGallons = (int) Math.ceil(squareFeet / conversion);

        // display number of gallons needed to paint ceiling as whole number
        System.out.println("You will need to buy " + amountOfGallons + " gallons of paint to cover " + squareFeet + ".");

    }
}
