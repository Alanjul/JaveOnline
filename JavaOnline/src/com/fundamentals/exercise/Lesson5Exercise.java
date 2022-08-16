package com.fundamentals.exercise;

public class Lesson5Exercise {


    //create a reference of lesson5Exercise class here and call methods
    byte myByte = (byte) 29.56;
    short myShort =29;

    int myInt =0;

    long myLong =29L;

    float myFloat =29.53F;

    double myDouble =29d;
    double myOtherDouble =245;

     //decimal value of 29
        int value =29;
        // hexadecimal of 29
        int value2 = 0x1d;
        //binary value of  29
        int value3=0b11101;

        public void LocalExercise5Example() {
            int b =10;
            System.out.println(b);
            value =19;
        }
        public void showLocalParameter(int b, int val) {
            int total =b +val;
            System.out.println(total);
        }

        public void showConversion() {
            // this is widening conversion
            myInt = myByte;
            System.out.println(myInt);
            myLong= myShort;
            System.out.println(myLong);
            myFloat= myInt;
            System.out.println(myFloat);
            // this is narrowing conversion
            myLong=(long)myDouble;
            System.out.println(myLong);
            myInt =(int)myFloat;
            System.out.println(myInt);
            myShort =(short)myLong;
            System.out.println(myShort);


        }

}
