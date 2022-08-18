package com.fundamentals.exercise;

public class Lesson6Exercise {
    String myString = "goodmorning";

    public void exerciseCharAt() {
        char myChar =myString.charAt(10);
        System.out.println(myChar);
    }// end method ExerciseCharAt

    public String exerciseLowerCase() {

        return myString.toLowerCase();
    }//end exerciseLowerCase
    char pilcrow ='\u00b6';
    public void exerciseChar() {
        System.out.println(pilcrow);
    }// end method exerciseChar
    public String exerciseUpperCase() {
        return myString.toUpperCase();
    }//end exercise upper class
    public void exerciseEscape() {
        System.out.println("Jack and Jill \nWent up the hill \n To fetch a pail of water. \n Jack fell down and broke his crown \n And Jill came tambling after.");
    }//end of method escape
}
