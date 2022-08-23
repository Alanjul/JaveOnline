package com.fundamentals.lessons;

/*
* the content of this  class is to go over lesson 8 content
* control flow statements
* */
public class Lesson8 {

    // this method shows an if statement
    public void basicIfExample(int num1, int num2) {
        System.out.println("before if statement");
        if(num1 == num2) {
            System.out.println("values are equal");
        }// end if
        System.out.println("After if statement");
    }// end method basic if example

    // This method shows an if else statement
    public void basicIfElseExample(int alpha, int beta){
        System.out.println("Before if statement");
        if(alpha != beta){
            System.out.println("The values are not equal");
        } else {
            System.out.println("the values are equal");
        }// end if else
        System.out.println("end of if else statement");
    }// end method basic if else example
    // This method shows an if else chain statements
    public void basicIfElseChainExample(int value){
        if(value < 30) {
         System.out.println("the value is less than 30");
        }else if(value<= 40) {
            System.out.println("The value is greater than 30 but less than or equal to 40");
        } else {
            System.out.println("the value is greater than 40");
        }// end if else chain
    }// end method basic if else chain example

    //This method shows how to the and / or statement with if
    public void basicIfAndOrExample(int num) {
        if(num > 100 || num <50) {
            System.out.println("the value is less than 50 or greater than 100");
        }// end if
        if (num % 2 == 0 && num > 30) {
            System.out.println("The value is greater than 30 and an even number");
        }// end if
    }// end method basic if and or example

    // This method shows how a switch statement is used.
    public void basicswitchExample(int day){
        switch (day) {
            case 1:
                System.out.println("day = 1");
                break;
            case 2:
            case 3:
                System.out.println("day is either 2 or 3");
                break;
            default:
                System.out.println("day is greater than 3");
                break;
        } // end switch
    } // end of method basic switch example

    // this method shows how to do a while loop
    public void basicWhileexample() {
        int val = 0; // initialized value
        while (val <10) {// expression
            System.out.println(val);
            val++;// increment
        }
    }// end basic while example

    // this method shows how to do a do while loop
    public void basicDoWhileExample() {
        int num = 0; // initialized value
        do {
            if (num %2 ==0) {
                System.out.println(num);
            }
            num++; // increment
        } while (num < 24); // expression
    } // end method basic do while example

    // this method shows how to do a for loop
    public void basicForLoopExample(){
        for (int i = 0; i <10; i++) {
            System.out.println(i);
        }
    }// end method basic forloop example
    // this method shows the branching statements of continue and break
    public void basicBranchExample() {
        for (int i =0; i<10; i++) {
            if (i == 2) {
                continue;
            }
            if (i ==4) {
                System.out.println("loop breaks");
                break;
            }
            System.out.println(i);
        }// end for loop
        System.out.println("end of loop");
    }// end method basic examples
}// end class
