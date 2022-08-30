package com.fundamentals.exercise;
import java.util.Scanner;

public class Lesson7Exercise {
    int  value1 =10; int value2 =32; int value3 = 12; int value4 =3;

    public void mathProblem() {
        int total = value1 +value2 *value3 /value4;
        System.out.println(total);
        int total1 = (value1 + value2) *value3/value4;
        System.out.println(total1);
    } // end method mathProblem

    public void exerciseModulus() {
        int a, b, c;
        System.out.println("enter two number to calculate their modulus");
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        b = in.nextInt();
        c = a % b ;
        System.out.println(" the modulus of two numbers =" +c);
    } // end method exercise modulus.
    public void exerciseAssignmentOperators() {
        double  number1 = 43.67;
        double myOtherNumber =45.5;
        number1 += myOtherNumber;
        System.out.println(myOtherNumber);
        number1 *= myOtherNumber;
        System.out.println(number1);
        myOtherNumber %= number1;
        System.out.println(number1);
        value1 ^= value2;
        System.out.println(value1);


    }
}
