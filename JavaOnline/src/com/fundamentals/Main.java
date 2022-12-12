package com.fundamentals;

import com.fundamentals.exercise.*;
import com.fundamentals.lessons.Lesson5.Lesson10;
import com.fundamentals.lessons.Lesson5.Lesson5;
import com.fundamentals.lessons.Lesson5.Lesson6;
import com.fundamentals.lessons.Lesson5.Lesson7;
import com.fundamentals.lessons.Lesson8;
import com.fundamentals.lessons.Lesson9;


public class Main {
    public static void main(String[] args) {
    // write your code here

        /**
         * this main class is the entry point to the  application
         **/
        //System.out.println("welcome Java");
        //System.out.println("This is my first sentence");
       // System.out.println("I am new to Java");
       // System.out.println("This JAva course is cool");
        //System.out.println("I am learning stuff every day");

        //House myHouse = new House();
        //lesson5Examples();
       // setMyInt();
       // lesson6Examples();
       // Lesson6Exercise();
        //lesson7Examples();
       // lesson7Exercise();
       // lesson8Examples();
       //Lesson8Exercise();
       //lesson9Examples();
        //lesson10Examples();
       //lesson9Exercise();
        //Lesson10Examples
       // Lesson11Examples();
        //new Lesson11Exercise();
        Lesson13Examples();

    }
    public static void Lesson13Examples(){
        House mynewHouse = new House("blue");
        Condo myCondo = new Condo("medium");
        mynewHouse.doorOpenClose(mynewHouse.getDoorColor());
        myCondo.doorOpenClose(myCondo.getDoorColor());
        House myHouse = new Condo();
        myHouse.doorOpenClose();
    }
    public static void Lesson11exercise(){
        Lesson11Exercise  myLesson11 = new Lesson11Exercise();
        Lesson11Exercise myOtherExerice = new Lesson11Exercise();

    }
    public static void Lesson11Examples(){
        House myHouse = new House();

        House myOtherHouse = new House();
    }
    public static void Lesson10Examples(){
        Lesson10 myLesson10 = new Lesson10();
       // Lesson10Extended myExtended = new Lesson10Extended();
       // lesson10.myDefualtMethod();

    }
    public static void lesson9Exercise(){
        Lesson9Exercise myLesson9 = new Lesson9Exercise();
        myLesson9.singleDimensionalArray();
        myLesson9.doubleDimensionArray ();
    }
    public static void lesson10Examples(){
        Lesson10 myLesson10 = new Lesson10();
        myLesson10.intialProject();
    }
    public static void lesson9Examples(){
        Lesson9 myLesson9 = new Lesson9();
        myLesson9.basicIntArray();
        myLesson9.basicTwoDimensionalArray();
        myLesson9.basicThreeDimensionalArray();
        myLesson9.basicJaggedArray();
    }
    public static void Lesson8Exercise(){
        Lesson8Exercise myLesson8 = new Lesson8Exercise();
        myLesson8.basicIfElseExercise("a", "p");
        myLesson8.basicSwitchExercise('A');
        myLesson8.basicLoopExercise();
    }
    public static void lesson8Examples(){
        Lesson8 myLesson8 =new Lesson8();
        myLesson8.basicIfExample(5,5);
        myLesson8.basicIfElseExample(12, 17);
        myLesson8.basicIfElseChainExample(42);
        myLesson8.basicIfAndOrExample(108 );
        myLesson8.basicswitchExample(2);
        myLesson8.basicWhileexample();
        myLesson8.basicDoWhileExample();
        myLesson8.basicForLoopExample();
        myLesson8.basicBranchExample();
    }
    public static void lesson7Exercise() {
        Lesson7Exercise myLesson7 = new Lesson7Exercise();
        myLesson7.mathProblem();
        myLesson7.exerciseModulus();
        myLesson7.exerciseAssignmentOperators();
    }

    public static void lesson7Examples() {
        Lesson7 myLesson7 = new Lesson7();
        myLesson7.basicMath();
        myLesson7.exampleModulus();
        myLesson7.addTwoNumbers();
        myLesson7.exampleAssignment1();
        myLesson7.exampleAssignment2();
        myLesson7.exampleIncrement();
        myLesson7.exampleDecrement();
    }
    private static void Lesson6Exercise() {
        Lesson6Exercise myLesson6 = new Lesson6Exercise();
        myLesson6.exerciseChar();
        String myStr1 = myLesson6.exerciseLowerCase();
        System.out.println(myStr1);
        System.out.println(myLesson6.exerciseUpperCase());
        myLesson6.exerciseEscape();
    }//end of method exercise


    public static void lesson6Examples() {
        Lesson6 myLesson6 =new Lesson6();
        myLesson6.exampleCharAt();
        myLesson6.examplesEquals("Happy");
        String myStr1 = myLesson6.exampleLowerCase();
        System.out.println(myStr1);
        System.out.println(myLesson6.exampleUpperCase());
        System.out.println(myLesson6.exampleUpperCase());
        myLesson6.exampleLength();
        myLesson6.exampleBuilder("Pizza",3);
        myLesson6.exampleChar();
        myLesson6.exampleEscape();
    }//end method lesson6Examples
    public static void lesson5Examples(){

        Lesson5 myLesson5 = new Lesson5();
        myLesson5.showLocalExample();
        myLesson5.showLocalWithParameter(10, 15);
        int value = myLesson5.showLocalWithReturn(25, 19);
        System.out.println(value);
        System.out.println(myLesson5.showLocalWithReturn(5, 8));
        myLesson5.showInstanceVariable();
        myLesson5.showConversions();
        //end lesson5Examplemethod
    }
public static void setMyInt(){
        int setMyInt =0;
        double myFloat =4.12;
        setMyInt =(int)myFloat;
        System.out.println(setMyInt);
        myFloat =(float)setMyInt;
        System.out.println(myFloat);

}



} //end class