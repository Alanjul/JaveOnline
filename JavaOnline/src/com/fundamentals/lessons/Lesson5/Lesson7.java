package com.fundamentals.lessons.Lesson5;
import java.util.Scanner;
/*
* the content of this class goes over lesson 7
* java operators
* */
public class Lesson7 {
    int value1 =45, value2 =23;
    // this method does basic math
    public void basicMath() {
        System.out.println(value1 + value2);
        System.out.println(value1 -value2);
        System.out.println(value1*value2);
        System.out.println((value1 / value2));
    }// end method basic math
    // this method calculate modulus
    public void exampleModulus() {
        int total = value1 % value2;
        System.out.println(total);
    }// end method exampleModulus
    //this method demostrates the scanner utility
    public void addTwoNumbers() {
        int x,y,z;
        System.out.println("enter two numbers to calculate their sum. ");
        Scanner in = new Scanner(System.in);
        x= in.nextInt();
        y= in.nextInt();
        z = x + y;
        System.out.println("The sum of the entered values = " +z);
    } // end method add two numbers
    //this method covers assignment operators for basic math
    public void exampleAssignment1() {
        value1 += value2;
        System.out.println(value1);
        value2 -= value1;
        System.out.println(value2);
        value1 *= value2;
        System.out.println(value1);
        value2 /= value1;
        System.out.println(value2);
        value2 %= value1 ;
        System.out.println(value1);
    }// end method example assignment1

    // this method covers assignment operators for additional types
    public void exampleAssignment2() {
        int beta = 10, charlie = 5;
        beta <<= charlie;
         System.out.println(beta);
        charlie >>= beta;
        System.out.println(charlie);
        beta &= charlie;
        System.out.println(beta);
        charlie ^= beta;
        System.out.println(charlie);
    }// end method example assignment2

    //This method covers the increment operator
    public void exampleIncrement() {
        int home =10, car, bike;
        car = home++;
        System.out.println(car);
        bike = ++home;
        System.out.println(bike);
    }//end method example increment

    //This method covers the decrement operator
    public void exampleDecrement() {
        int bottle = 4, mug, pitcher;
        mug = bottle--;
        System.out.println(mug);
        pitcher = --bottle;
        System.out.println(pitcher);
    }// end method example decrement
}//end of class
