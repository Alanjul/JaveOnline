package com.fundamentals.lessons.Lesson5;

/*
* The content of this class is for lesson 6 slide deck
* strings and more
* */
public class Lesson6 {

    String myString = "Hello";

    // method shows string method for charAt
    public void exampleCharAt(){
       char myChar =myString.charAt(2);
       System.out.println(myChar);
    }//end method exampleCharAt

    // method compares two strings to see if they are equal
    public void examplesEquals(String value) {
        boolean myBoolean =myString.equals(value);
        System.out.println(myBoolean);
    } //end method exampleEquals

    // Method takes a string and converts it to all lowerCase

    public String exampleLowerCase() {
        return myString.toLowerCase();
    } //end method exampleLowerCase

    // method takes a string and converts it to all upperCase
    public String exampleUpperCase() {
        return myString.toUpperCase();
    }// end exampleUppercase

    //method determines the length of the string
    public void exampleLength() {
        int length =myString.length();
        System.out.println(length);
    }// end method exampleLength
    // Example of how to use the stringBuilder class
    public void exampleBuilder(String food,int value) {
        StringBuilder builder = new StringBuilder();
        builder.append("my favorite food is ");
        builder.append(food).append(" and i ate ");
        builder.append(value).append(" plates of it. ");
        String fav =builder.toString();
        System.out.println(fav);
    }// end method exampleBuilder

    //method for showing char data type
    public void exampleChar() {
        char c1 ='t';//\u0074
        char c2= '\u00A7';
        System.out.println(c2);
    }//end method exampleChar

    //method shows escape sequence
    public void exampleEscape() {
        System.out.println("that\'s a cool boy. \tCan i\n play with it. ");
    }// end method exampleEscape


}//end class
