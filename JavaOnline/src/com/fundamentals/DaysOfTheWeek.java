package com.fundamentals;
/*
* this enum is part of lesson 16.*/
public enum DaysOfTheWeek {
    SUN,MON,TUES,WED,FRID, SAT;

    public static void main(String[] args){
       System.out.println("hello Enum ") ;
    }
private DaysOfTheWeek(){
        System.out.println("Enum constructor called ");
}
public void enumMethod(){
        System.out.println("method inside the enum ");
}
}
