package com.fundamentals.exercise;

public class Lesson14Exercise {
    public static int current;
    public static double resistance;

    public static int myFirstVoltageMethod(int current, int resistance) {
        int voltage = current * resistance;
        return voltage;
    }
    public static double currentMethhod(int voltage, int resistance ){
         int current =  (voltage / resistance);
         return  (double)current;

    }
    public static double resistanceMethod(int voltage, int current){
        return resistance = (double)voltage/ current;
    }
}

