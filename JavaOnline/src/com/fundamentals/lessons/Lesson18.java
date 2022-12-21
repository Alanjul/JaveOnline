package com.fundamentals.lessons;

import com.fundamentals.House;

/*
* the class content is for lesson 18 exception or exception handling */
public class Lesson18 {
    String myString;
    House myHouse;
    // this method will show a basic try catch /finally
    public void exampleException(){
        try{

            System.out.println(myHouse.equals(myString));
            System.out.println("try block ran");
        } catch(NullPointerException e){
            System.out.println( "Null Exception thrown" + e.getMessage());
        } finally {
            System.out.println("Finally block called");
        }// end try/catch/finally
    }// end of the method
    // this method show try with multiple catches
    public void myArrayException(){
        String[]names = { "Dave", "Matt", "Jody"};
        String[] values = { "24", "42", "38"};
        int hmmm = Integer.MAX_VALUE;
        try{
            byte b = Byte.parseByte(values[1]);
            int total = Math.addExact(b,hmmm);
            System.out.println(total);
        } catch(IndexOutOfBoundsException ex){
            System.out.println(" Please provide atleast 1 argument");
        } catch(NumberFormatException nf){
            System.out.println("That is not  a number");
        }catch(ArithmeticException ae){
            System.out.println("you have given me more than i need");
        } catch(Exception e){
            System.out.println("i don't know what you did " + e.toString());
        }finally {
            System.out.println("finally my number did not work");
        }// end my catch/ finally
    }// end method
} // end class
