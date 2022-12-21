package com.fundamentals.exercise;

import java.util.Scanner;

public class Lesson18Exercise {
    int year;
    public void LeapYear( ) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Enter the year ");
            year = Integer.parseInt(input.nextLine());
            if (year % 4 != 0) {
                throw new Exception("you did not provide a valid leap year");

            }
            System.out.println("it is a leap year ");
            } catch(NumberFormatException nf) {
            System.out.println("enter a year");


        } catch (Exception e) {

            System.out.println(e.getMessage());
        }
    }

}
